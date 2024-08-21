package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pergunta 1: Que ambientação você prefere?");
        System.out.println("1. Sci-Fi");
        System.out.println("2. Medieval");
        int resp1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pergunta 2: Que gênero você prefere?");
        System.out.println("1. Comédia");
        System.out.println("2. Drama");
        int resp2 = scanner.nextInt();
        scanner.nextLine();

        if (resp1 == 1 && resp2 == 1) {
            System.out.println("Homens de Preto");
        } else if (resp1 == 1 && resp2 == 2) {
            System.out.println("Arrival");
        } else if (resp1 == 2 && resp2 == 1) {
            System.out.println("Shrek");
        } else if (resp1 == 2 && resp2 == 2) {
            System.out.println("Gladiador");
        } else {
            System.out.println("Por favor, insira 1 ou 2");
            return;
        }
    }
}