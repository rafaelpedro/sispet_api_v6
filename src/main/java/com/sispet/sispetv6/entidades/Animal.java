package com.sispet.sispetv6.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cor;
    @Column(nullable = false)
    private String nomeResponsavel;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false)
    private String temperamento;
    @Column(nullable = false)
    private String especie;

}
