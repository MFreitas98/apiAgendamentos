package com.example.test.model;

import com.example.test.enums.TipoPagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "pagamento")
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Double valorTotal;

    @Column
    @Enumerated(EnumType.STRING)
    private TipoPagamento tipo;

    @OneToOne(mappedBy = "pagamento")
    @JsonIgnore
    private Agendamento agendamento;

}
