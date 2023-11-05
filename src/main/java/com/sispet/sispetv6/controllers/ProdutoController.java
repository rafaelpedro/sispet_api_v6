package com.sispet.sispetv6.controllers;

import com.sispet.sispetv6.DTO.ProdutoDTO;
import com.sispet.sispetv6.entidades.Produto;
import com.sispet.sispetv6.repositorios.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoRepositorio produtoRepositorio;

    @GetMapping("/produtos")
    public List<Produto> listarProdutos(){
        return produtoRepositorio.findAll();
    }

    @PostMapping("/produtos")
    public Produto criarProduto(@RequestBody ProdutoDTO produtoDTO){
        Produto produtoNovo = new Produto();

        produtoNovo.setDescricao(produtoDTO.getDescricao());
        produtoNovo.setValor(produtoDTO.getValor());
        produtoNovo.setEstoque(produtoDTO.getEstoque());

        return produtoRepositorio.save(produtoNovo);
    }

    @PutMapping("/produtos/{id}")
    public Produto editarProduto(@PathVariable long id, @RequestBody ProdutoDTO produtoDTO){

        Optional<Produto> produtoEncontrado = produtoRepositorio.findById(id);

        produtoEncontrado.get().setDescricao(produtoDTO.getDescricao());
        produtoEncontrado.get().setValor(produtoDTO.getValor());
        produtoEncontrado.get().setEstoque(produtoDTO.getEstoque());

        return produtoRepositorio.save(produtoEncontrado.get());
    }

    @DeleteMapping("/produtos/{id}")
    public void deletarProduto(@PathVariable long id){
        produtoRepositorio.deleteById(id);
    }
}
