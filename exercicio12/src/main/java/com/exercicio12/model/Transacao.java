package com.exercicio12.model;

import lombok.Getter;
import lombok.Setter;

public class Transacao {
    @Getter
    @Setter
    private Conta origem;
    @Getter
    @Setter
    private Conta destino;
    @Getter
    @Setter
    private Double valor;

    public Transacao(Conta origem, Conta destino, Double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }
}