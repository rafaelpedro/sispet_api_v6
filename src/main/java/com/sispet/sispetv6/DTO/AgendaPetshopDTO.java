package com.sispet.sispetv6.DTO;

import com.sispet.sispetv6.entidades.Animal;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class AgendaPetshopDTO {

    private long id;
    @NotBlank(message = "O campo hora entrada é obrigatório")
    private LocalDateTime horarioEntrada;
    @NotBlank(message = "O campo hora saida é obrigatório")
    private LocalDateTime horarioSaida;
    @NotBlank(message = "O campo cuidador é obrigatório")
    private String cuidadorResponsavel;
    @NotBlank(message = "O campo servico é obrigatório")
    private String servico;
    @NotBlank(message = "O campo paciente é obrigatório")
    private Animal paciente;
}
