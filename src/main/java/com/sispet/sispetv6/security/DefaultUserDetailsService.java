package com.sispet.sispetv6.security;

import com.sispet.sispetv6.repositorios.UsuarioRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@AllArgsConstructor
public class DefaultUserDetailsService implements UserDetailsService {

    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username != null && !username.isBlank()) {
            var usuario = usuarioRepositorio.findByLogin(username).orElseThrow(() -> new UsernameNotFoundException("Not Found"));
            return User.builder()
                .username(usuario.getLogin())
                .password(usuario.getSenha())
                .roles("admin")
                .build();
        }

        throw new UsernameNotFoundException("Not Found");
    }
}
