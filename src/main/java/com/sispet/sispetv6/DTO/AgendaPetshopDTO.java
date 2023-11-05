package com.sispet.sispetv6.DTO;

import com.sispet.sispetv6.entidades.Animal;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class AgendaPetshopDTO {

    private long id;
    private LocalDateTime horarioEntrada;
    private LocalDateTime horarioSaida;
    private String cuidadorResponsavel;
    private String servico;
    private Animal paciente;
}
