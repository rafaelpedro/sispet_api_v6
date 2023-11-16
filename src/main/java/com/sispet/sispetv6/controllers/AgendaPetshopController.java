package com.sispet.sispetv6.controllers;

import com.sispet.sispetv6.DTO.AgendaPetshopDTO;
import com.sispet.sispetv6.DTO.AgendaVeterinarioDTO;
import com.sispet.sispetv6.entidades.AgendaPetshop;
import com.sispet.sispetv6.entidades.AgendaVeterinario;
import com.sispet.sispetv6.repositorios.AgendaPetshopRepositorio;
import com.sispet.sispetv6.repositorios.AgendaVeterinarioRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgendaPetshopController {

    @Autowired
    AgendaPetshopRepositorio agendaPetshopRepositorio;

    @GetMapping("/agenda-pet")
    public List<AgendaPetshop> listarAgendaPet(){
        return agendaPetshopRepositorio.findAll();
    }

    @PostMapping("/agenda-pet")
    public AgendaPetshop criarAgendaPet(@RequestBody @Valid AgendaPetshopDTO agendaPetshopDTO){
        AgendaPetshop agendaPetNovo = new AgendaPetshop();

        agendaPetNovo.setHorarioEntrada(agendaPetshopDTO.getHorarioEntrada());
        agendaPetNovo.setHorarioSaida(agendaPetshopDTO.getHorarioSaida());
        agendaPetNovo.setCuidadorResponsavel(agendaPetshopDTO.getCuidadorResponsavel());
        agendaPetNovo.setServico(agendaPetshopDTO.getServico());
        agendaPetNovo.setPaciente(agendaPetshopDTO.getPaciente());


        return agendaPetshopRepositorio.save(agendaPetNovo);
    }

    @PutMapping("/agenda-pet/{id}")
    public AgendaPetshop editarAgendaPet(@PathVariable long id, @RequestBody AgendaPetshopDTO agendaPetshopDTO){

        Optional<AgendaPetshop> agendaPetEncontrado = agendaPetshopRepositorio.findById(id);

        agendaPetEncontrado.get().setHorarioEntrada(agendaPetshopDTO.getHorarioEntrada());
        agendaPetEncontrado.get().setHorarioSaida(agendaPetshopDTO.getHorarioSaida());
        agendaPetEncontrado.get().setCuidadorResponsavel(agendaPetshopDTO.getCuidadorResponsavel());
        agendaPetEncontrado.get().setServico(agendaPetshopDTO.getServico());
        agendaPetEncontrado.get().setPaciente(agendaPetshopDTO.getPaciente());

        return agendaPetshopRepositorio.save(agendaPetEncontrado.get());
    }

    @DeleteMapping("/agenda-pet/{id}")
    public void deletarAgendaPet(@PathVariable long id){
        agendaPetshopRepositorio.deleteById(id);
    }
}
