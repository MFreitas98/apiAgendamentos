package com.example.test.repository;

import com.example.test.model.Agendamento;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AgendamentoRepositoryTest {

    @Autowired
    AgendamentoRepository agendamentoRepository;

    @Autowired
    TestEntityManager entityManager;

    @Test
    public void buscaAgendamentoPorId(){
        Agendamento a = criarAgendamento();

        Optional<Agendamento> result = agendamentoRepository.findById(1L);

        Assertions.assertThat(result.isPresent()).isFalse();
    }


    //Construtor
    public static Agendamento criarAgendamento(){
        return Agendamento.builder().id(1L)
                .build();
    }
}
