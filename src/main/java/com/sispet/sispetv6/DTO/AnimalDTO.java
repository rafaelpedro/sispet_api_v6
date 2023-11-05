package com.sispet.sispetv6.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AnimalDTO {

    private String nome;
    private String cor;
    private String nomeResponsavel;
    private LocalDate dataNascimento;
    private String temperamento;
    private String especie;

}
