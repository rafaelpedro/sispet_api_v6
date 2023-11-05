package com.sispet.sispetv6.controllers;

import com.sispet.sispetv6.DTO.AgendaVeterinarioDTO;
import com.sispet.sispetv6.DTO.AnimalDTO;
import com.sispet.sispetv6.entidades.AgendaVeterinario;
import com.sispet.sispetv6.entidades.Animal;
import com.sispet.sispetv6.repositorios.AgendaVeterinarioRepositorio;
import com.sispet.sispetv6.repositorios.AnimalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgendaVeterinarioController {

    @Autowired
    AgendaVeterinarioRepositorio agendaVeterinarioRepositorio;

    @GetMapping("/agenda-vet")
    public List<AgendaVeterinario> listarAgendaVet(){
        return agendaVeterinarioRepositorio.findAll();
    }

    @PostMapping("/agenda-vet")
    public AgendaVeterinario criarAgendaVet(@RequestBody AgendaVeterinarioDTO agendaVeterinarioDTO){
        AgendaVeterinario agendaVetNovo = new AgendaVeterinario();

        agendaVetNovo.setHorarioEntrada(agendaVeterinarioDTO.getHorarioEntrada());
        agendaVetNovo.setHorarioSaida(agendaVeterinarioDTO.getHorarioSaida());
        agendaVetNovo.setVeterinarioResponsavel(agendaVeterinarioDTO.getVeterinarioResponsavel());
        agendaVetNovo.setMotivoConsulta(agendaVeterinarioDTO.getMotivoConsulta());
        agendaVetNovo.setPaciente(agendaVeterinarioDTO.getPaciente());


        return agendaVeterinarioRepositorio.save(agendaVetNovo);
    }

    @PutMapping("/agenda-vet/{id}")
    public AgendaVeterinario editarAgendaVet(@PathVariable long id, @RequestBody AgendaVeterinarioDTO agendaVeterinarioDTO){

        Optional<AgendaVeterinario> agendaVetEncontrado = agendaVeterinarioRepositorio.findById(id);

        agendaVetEncontrado.get().setHorarioEntrada(agendaVeterinarioDTO.getHorarioEntrada());
        agendaVetEncontrado.get().setHorarioSaida(agendaVeterinarioDTO.getHorarioSaida());
        agendaVetEncontrado.get().setVeterinarioResponsavel(agendaVeterinarioDTO.getVeterinarioResponsavel());
        agendaVetEncontrado.get().setMotivoConsulta(agendaVeterinarioDTO.getMotivoConsulta());
        agendaVetEncontrado.get().setPaciente(agendaVeterinarioDTO.getPaciente());

        return agendaVeterinarioRepositorio.save(agendaVetEncontrado.get());
    }

    @DeleteMapping("/agenda-vet/{id}")
    public void deletarAgendaVet(@PathVariable long id){
        agendaVeterinarioRepositorio.deleteById(id);
    }
}
