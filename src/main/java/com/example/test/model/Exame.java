package com.example.test.model;

import com.example.test.enums.TipoExame;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "exame")
public class Exame implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nomeExame;

    @Column
    @Enumerated(EnumType.STRING)
    private TipoExame tipo;

    @Column
    private Double valorExame;

    @ManyToOne
    @JoinColumn(name = "id_agendamento", referencedColumnName = "id")
    @JsonIgnore
    private Agendamento agendamento;
}
