package com.exercicio12.mappers;

import com.exercicio12.dto.ContaDTO;
import com.exercicio12.model.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}