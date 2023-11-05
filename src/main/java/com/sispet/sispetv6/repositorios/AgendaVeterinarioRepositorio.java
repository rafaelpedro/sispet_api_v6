package com.sispet.sispetv6.repositorios;

import com.sispet.sispetv6.entidades.AgendaVeterinario;
import com.sispet.sispetv6.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaVeterinarioRepositorio extends JpaRepository<AgendaVeterinario, Long> {
}
