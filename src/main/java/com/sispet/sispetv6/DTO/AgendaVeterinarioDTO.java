package com.sispet.sispetv6.DTO;

import com.sispet.sispetv6.entidades.Animal;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AgendaVeterinarioDTO {

    private long id;
    @NotBlank(message = "O campo hora entrada é obrigatório")
    private LocalDateTime horarioEntrada;
    @NotBlank(message = "O campo hora saida é obrigatório")
    private LocalDateTime horarioSaida;
    @NotBlank(message = "O campo veterinario é obrigatório")
    private String veterinarioResponsavel;
    @NotBlank(message = "O campo motivo consulta é obrigatório")
    private String motivoConsulta;
    @NotBlank(message = "O campo paciente é obrigatório")
    private Animal paciente;

}
