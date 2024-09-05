package org.example;

public class Main {
    public static void main(String[] args) {
        Postagem postagem = new Postagem("Minha primeira postagem", "Esta é uma descrição da minha primeira postagem.", "imagem");

        MyBook myBook = new MyBook();
        myBook.compartilharPostagem(postagem);

        Fotogram fotogram = new Fotogram();
        try {
            fotogram.compartilharImagem(postagem);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        AnyTube anyTube = new AnyTube();
        try {
            anyTube.compartilharVideo(postagem);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}