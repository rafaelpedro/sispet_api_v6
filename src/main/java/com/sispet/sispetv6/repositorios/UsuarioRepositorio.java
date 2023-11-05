package com.sispet.sispetv6.repositorios;

import com.sispet.sispetv6.entidades.Animal;
import com.sispet.sispetv6.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
