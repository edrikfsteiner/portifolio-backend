package com.exercicio13.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class JogadorDTO {
    @Getter
    @Setter
    @NotBlank(message = "Nome obrigatório")
    private String nome;
    @Getter
    @Setter
    @NotBlank(message = "Apelido obrigatório")
    private String apelido;
}