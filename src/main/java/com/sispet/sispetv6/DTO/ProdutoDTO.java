package com.sispet.sispetv6.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDTO {
    private long id;
    private String descricao;
    private Double valor;
    private Integer estoque;
}
