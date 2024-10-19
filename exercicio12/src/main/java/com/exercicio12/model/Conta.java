package com.exercicio12.model;

import lombok.Getter;
import lombok.Setter;

public class Conta {
    @Getter
    @Setter
    private String codigo;
    @Getter
    @Setter
    private String cliente;
    @Getter
    @Setter
    private Double saldo;

    public Conta(String codigo, String cliente, Double saldo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.saldo = saldo;
    }
}