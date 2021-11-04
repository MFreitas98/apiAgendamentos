package com.example.test.service;

import com.example.test.model.Agendamento;
import com.example.test.model.Exame;
import com.example.test.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    private final PagamentoService pagamentoService;

    public AgendamentoService(AgendamentoRepository agendamentoRepository, PagamentoService pagamentoService) {
        this.agendamentoRepository = agendamentoRepository;
        this.pagamentoService = pagamentoService;
    }

    public List<Agendamento> findAll() {
        List<Agendamento> getAllPersons = agendamentoRepository.findAll();
        return getAllPersons;
    }

    public Agendamento save(Agendamento agendamento) {
        pagamentoService.calculaValorTotal(agendamento);
        return agendamentoRepository.save(agendamento);
    }

    public void deleteAgendamento(Long id) {
        agendamentoRepository.deleteById(id);
    }

    public Optional<Agendamento> findById(Long id) {
        return agendamentoRepository.findById(id);
    }

    public Agendamento updateAgendamentos(Agendamento agendamento){
        Agendamento ag = agendamentoRepository.getById(agendamento.getId());
        for (Exame ex : agendamento.getExames()){
            List<Exame> ez = ag.getExames();
            ez.add(ex);
            ag.setExames(ez);
        }
        return save(ag);
    }
}
