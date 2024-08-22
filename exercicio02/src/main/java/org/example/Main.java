package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem("Steve", 100, 20);
        List<Personagem> inimigos = new ArrayList<>();

        inimigos.add(new Personagem("Orc", 100, 10));
        inimigos.add(new Personagem("Goblin", 50, 5));
        inimigos.add(new Personagem("Lobo", 75, 15));
        inimigos.add(new Personagem("Cavaleiro", 200, 20));
        inimigos.add(new Personagem("Dragão", 100, 10));

        for (Personagem inimigo : inimigos) {
            while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
                jogador.atacar(inimigo);
                if (inimigo.getVida() > 0) {
                    inimigo.atacar(jogador);
                }
            }
            if (jogador.getVida() <= 0) {
                break;
            }
        }

        if (jogador.getVida() > 0) {
            System.out.println(jogador.getNome() + " venceu a batalha!");
        } else {
            System.out.println("Todos os inimigos derrotaram " + jogador.getNome());
        }
    }
}