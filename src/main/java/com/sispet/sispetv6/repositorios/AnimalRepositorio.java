package com.sispet.sispetv6.repositorios;

import com.sispet.sispetv6.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepositorio extends JpaRepository<Animal, Long> {

    List<Animal> searchByNome(String nome);
}
