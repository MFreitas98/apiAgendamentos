package com.example.test.controller;

import com.example.test.model.Agendamento;
import com.example.test.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    AgendamentoService agendamentoService;

    @GetMapping
    public List<Agendamento> getAll(){
        return agendamentoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Agendamento> findById(@PathVariable("id") Long id){
        return agendamentoService.findById(id);
    }

    @PostMapping("/novoAgendamento")
    public Agendamento saveAll(@RequestBody Agendamento agendamento){
        return agendamentoService.save(agendamento);
    }

    @PutMapping("/alteraAgendamento")
    public Agendamento updateAgendamento(@RequestBody Agendamento agendamento){
        return agendamentoService.updateAgendamentos(agendamento);
    }

    @DeleteMapping("/{id}")
    public void deleteagendamento(@PathVariable("id") Long id){
        agendamentoService.deleteAgendamento(id);
    }




}
