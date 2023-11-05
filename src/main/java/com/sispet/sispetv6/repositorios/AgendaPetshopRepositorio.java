package com.sispet.sispetv6.repositorios;

import com.sispet.sispetv6.entidades.AgendaPetshop;
import com.sispet.sispetv6.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaPetshopRepositorio  extends JpaRepository<AgendaPetshop, Long> {
}
