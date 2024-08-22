package org.example;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        
        if (this.vida <= 0) {
            System.out.println(this.nome + " foi derrotado");
        }
    }

    public void atacar(Personagem alvo) {
        alvo.receberDano(this.ataque);

        if (alvo.getVida() <= 0) {
            System.out.println("Ataque falhou");
        }
    }
}
