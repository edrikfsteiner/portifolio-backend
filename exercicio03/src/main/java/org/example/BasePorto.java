package org.example;
import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    private String nome;
    private List<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public List<Barco> getBarcosAtracados() {
        return this.barcosAtracados;
    }

    public boolean atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        System.out.println(barco.getNome() + " atracado em " + getNome());
        return true;
    }

    public boolean desatracarBarco (Barco barco) {
        barcosAtracados.remove(barco);
        System.out.println(barco.getNome() + " desatracado de " + getNome());
        return true;
    }
}
