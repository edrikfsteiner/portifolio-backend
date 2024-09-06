package org.example;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;
    private List<String> assentosDisponiveis;

    public Cinema() {
        this.filmesDisponiveis = new ArrayList<>();
        this.ingressosVendidos = new ArrayList<>();
        this.assentosDisponiveis = new ArrayList<>();
        for (char fila = 'A'; fila <= 'F'; fila++) {
            for (int numero = 1; numero <= 5; numero++) {
                assentosDisponiveis.add(fila + String.valueOf(numero));
            }
        }
    }

    public List<Filme> getFilmesDisponiveis() {
        return this.filmesDisponiveis;
    }   

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nome) throws Exception {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        throw new Exception("Filme não encontrado!");
    }

    public boolean verificarAssentoDisponivel(String assento) {
        return assentosDisponiveis.contains(assento);
    }

    public void venderIngresso(Ingresso ingresso) {
        ingressosVendidos.add(ingresso);
        assentosDisponiveis.remove(ingresso.getAssento());
    }
}