package com.sispet.sispetv6.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class AgendaPetshop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalDateTime horarioEntrada;

    @Column(nullable = true)
    private LocalDateTime horarioSaida;

    @Column(nullable = false)
    private String cuidadorResponsavel;

    @Column(nullable = false)
    private String servico;

    @OneToOne
    @JoinColumn(name="animal_id", referencedColumnName="id")
    private Animal paciente;
}
