package com.sispet.sispetv6.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AnimalDTO {

    @NotBlank(message = "O campo nome é obrigatório")
    private String nome;
    @NotBlank(message = "O campo cor é obrigatório")
    private String cor;
    @NotBlank(message = "O campo responsavel é obrigatório")
    private String nomeResponsavel;
    @NotBlank(message = "O campo data nascimento é obrigatório")
    private LocalDate dataNascimento;
    @NotBlank(message = "O campo temperamento é obrigatório")
    private String temperamento;
    @NotBlank(message = "O campo especie é obrigatório")
    private String especie;

}
