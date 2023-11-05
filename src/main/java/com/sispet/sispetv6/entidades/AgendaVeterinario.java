package com.sispet.sispetv6.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class AgendaVeterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalDateTime horarioEntrada;

    @Column(nullable = true)
    private LocalDateTime horarioSaida;

    @Column(nullable = false)
    private String veterinarioResponsavel;

    @Column(nullable = false)
    private String motivoConsulta;

    @OneToOne
    @JoinColumn(name="animal_id", referencedColumnName="id")
    private Animal paciente;
}
