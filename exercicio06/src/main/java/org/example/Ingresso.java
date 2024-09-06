package org.example;

public class Ingresso {
    private Cliente cliente;
    private Filme filme;
    private String assento;

    public Ingresso(Cliente cliente, Filme filme, String assento) {
        this.cliente = cliente;
        this.filme = filme;
        this.assento = assento;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Filme getFilme() {
        return this.filme;
    }

    public String getAssento() {
        return this.assento;
    }

    @Override
    public String toString() {
        return "Ingresso vendido com sucesso! " + filme.getNome() + " - " + assento + " - " + cliente.getNome();
    }   
}