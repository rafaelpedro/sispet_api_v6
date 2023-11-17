package com.sispet.sispetv6.security;

import com.sispet.sispetv6.entidades.Usuario;
import com.sispet.sispetv6.repositorios.UsuarioRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InicializarComAdmin implements ApplicationListener<ApplicationReadyEvent> {

    private UsuarioRepositorio usuarioRepositorio;
    private PasswordEncoder codificadorDeSenhas;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        if (usuarioRepositorio.findAll().isEmpty()) {
            //cria um ADMIN padrão se não encontrar nenhum ADMIN
            Usuario usuario = new Usuario();
            usuario.setLogin("admin");
            usuario.setNome("admin");
            usuario.setSenha(codificadorDeSenhas.encode("mestre"));

            var usuarioSalvo = usuarioRepositorio.save(usuario);
        }
    }
}
