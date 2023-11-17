package com.sispet.sispetv6.repositorios;

import com.sispet.sispetv6.entidades.Animal;
import com.sispet.sispetv6.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByLogin(String login);
}
