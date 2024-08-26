package org.example;

public class Barco {
    private String nome;
    private int tamanho;

    public Barco(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return this.nome;
    }

    public int getTamanho() {
        return this.tamanho;
    }
}