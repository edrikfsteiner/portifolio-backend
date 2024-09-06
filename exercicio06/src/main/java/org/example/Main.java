package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        cinema.adicionarFilme(new Filme("Homem Aranha", 20.0, 12));
        cinema.adicionarFilme(new Filme("Oppenheimer", 25.0, 16));
        cinema.adicionarFilme(new Filme("Barbie", 15.0, 10));
        cinema.adicionarFilme(new Filme("Missão Impossível", 30.0, 14));
        cinema.adicionarFilme(new Filme("Elementos", 10.0, 8));

        while (true) {
            try {
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = scanner.nextLine();
                Filme filme = cinema.buscarFilme(nomeFilme);

                System.out.println("Qual assento você deseja?");
                String assento = scanner.nextLine();
                if (!cinema.verificarAssentoDisponivel(assento)) {
                    throw new Exception("O ingresso não pode ser vendido pois o assento não está mais disponível!");
                }

                System.out.println("Qual o seu nome?");
                String nomeCliente = scanner.nextLine();

                System.out.println("Qual a sua idade?");
                int idadeCliente = Integer.parseInt(scanner.nextLine());
                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                if (cliente.getIdade() < filme.getIdadeMinima()) {
                    throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
                }

                Ingresso ingresso = new Ingresso(cliente, filme, assento);
                cinema.venderIngresso(ingresso);
                System.out.println(ingresso);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja realizar outra compra? [s/n]");
            String resposta = scanner.nextLine();
            if (resposta.equals("n")) {
                break;
            }
        }
    }
}