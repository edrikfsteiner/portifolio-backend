package com.exercicio12.dto;

public record TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, Double valor) {}