package org.example;
import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<>();
        musicasDisponiveis.add(new Musica("Hino do Real Paulista", "Paulista Band"));
        musicasDisponiveis.add(new Musica("Macarena", "Los Del Rio"));
        musicasDisponiveis.add(new Musica("Evidencias", "Chitaozinho e Xororo"));
    }

    public List<Musica> getMusicasDisponiveis() {
        return musicasDisponiveis;
    }

    public Musica pesquisarMusica(String titulo) throws Exception {
        for (Musica musica : musicasDisponiveis) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                return musica;
            }
        }
        throw new Exception("A música " + titulo + " não foi encontrada no sistema.");
    }
}
