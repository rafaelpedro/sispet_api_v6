package com.sispet.sispetv6.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDTO {
    private long id;
    @NotBlank(message = "O campo descricao é obrigatório")
    private String descricao;
    @NotBlank(message = "O campo valor é obrigatório")
    private Double valor;
    @NotBlank(message = "O compo estoque é obrigatório")
    private Integer estoque;
}
