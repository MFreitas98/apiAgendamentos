package com.example.test.service;

import com.example.test.model.Agendamento;
import com.example.test.model.Exame;
import com.example.test.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    PagamentoRepository pagamentoRepository;

    @Autowired
    ExameService exameService;

    public Agendamento calculaValorTotal(Agendamento agendamento){
        for (Exame ex : agendamento.getExames()){
            if (agendamento.getPagamento().getValorTotal() == null){
                agendamento.getPagamento().setValorTotal(0.0);
            }
            agendamento.getPagamento().setValorTotal(agendamento.getPagamento().getValorTotal() + ex.getValorExame());
        }
        return agendamento;
    }

}
