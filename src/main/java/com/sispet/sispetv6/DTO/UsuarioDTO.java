package com.sispet.sispetv6.DTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class UsuarioDTO {

    private long id;

    @NotBlank(message = "O nome é obrigatório")
    @Length(min = 3, max = 10, message = "O nome deverá ter no máximo {max} caracteres")
    private String login;
    @NotBlank(message = "O nome é obrigatório")
    @Length(min = 3, max = 10, message = "O nome deverá ter no máximo {max} caracteres")
    private String senha;
    @NotBlank(message = "O nome é obrigatório")
    @Length(min = 3, max = 50, message = "O nome deverá ter no máximo {max} caracteres")
    private String nome;
}
