package com.sispet.sispetv6.controllers;

import com.sispet.sispetv6.DTO.UsuarioDTO;
import com.sispet.sispetv6.entidades.Usuario;
import com.sispet.sispetv6.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios(){
        return usuarioRepositorio.findAll();
    }

    @PostMapping("/usuarios")
    public Usuario criarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        Usuario usuarioNovo = new Usuario();

        usuarioNovo.setNome(usuarioDTO.getNome());
        usuarioNovo.setLogin(usuarioDTO.getLogin());
        usuarioNovo.setSenha(usuarioDTO.getSenha());

        return usuarioRepositorio.save(usuarioNovo);
    }

    @PutMapping("/usuarios/{id}")
    public Usuario editarUsuario(@PathVariable long id, @RequestBody UsuarioDTO usuarioDTO){

        Optional<Usuario> usuarioEncontrado = usuarioRepositorio.findById(id);

        usuarioEncontrado.get().setNome(usuarioDTO.getNome());
        usuarioEncontrado.get().setLogin(usuarioDTO.getLogin());
        usuarioEncontrado.get().setSenha(usuarioDTO.getSenha());

        return usuarioRepositorio.save(usuarioEncontrado.get());
    }

    @DeleteMapping("/usuarios/{id}")
    public void deletarUsuario(@PathVariable long id){
        usuarioRepositorio.deleteById(id);
    }
}
