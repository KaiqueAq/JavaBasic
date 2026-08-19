package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            System.out.print("Digite uma nota (entre 0 e 10): ");
            double notaDigitada = ler.nextDouble();

            if (notaDigitada >= 0 && notaDigitada <= 10) {
                notas.add(notaDigitada);
            } else {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                resposta = "s";
                continue;
            }

            System.out.println("Deseja inserir mais uma nota?");
            System.out.print("Pressione N para sair ou S para continuar: ");
            resposta = ler.next();

        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\n--- Exibindo as notas ---");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        ler.close();
    }
}
