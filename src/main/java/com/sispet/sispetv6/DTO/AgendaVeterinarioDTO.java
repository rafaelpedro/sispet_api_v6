package com.sispet.sispetv6.DTO;

import com.sispet.sispetv6.entidades.Animal;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AgendaVeterinarioDTO {

    private long id;
    private LocalDateTime horarioEntrada;
    private LocalDateTime horarioSaida;
    private String veterinarioResponsavel;
    private String motivoConsulta;
    private Animal paciente;

}
