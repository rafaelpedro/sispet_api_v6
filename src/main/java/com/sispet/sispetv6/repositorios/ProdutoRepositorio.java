package com.sispet.sispetv6.repositorios;

import com.sispet.sispetv6.entidades.Animal;
import com.sispet.sispetv6.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
}
