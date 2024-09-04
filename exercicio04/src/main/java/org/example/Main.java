package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud();

        System.out.println("Digite o nome da playlist:");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        while (true) {
            System.out.println("Digite o nome da música:");
            String tituloMusica = scanner.nextLine();

            try {
                Musica musica = musicCloud.pesquisarMusica(tituloMusica);
                playlist.adicionarMusica(musica);
                System.out.println("Você adicionou a música " + musica.getTitulo() + " na playlist.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja adicionar outra música? [s/n]");
            String resposta = scanner.nextLine();
            
            if (resposta.equals("n")) {
                break;
            }
        }

        System.out.println(playlist);
    }
}
