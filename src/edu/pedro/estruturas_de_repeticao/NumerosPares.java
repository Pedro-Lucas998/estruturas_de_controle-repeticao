package edu.pedro.estruturas_de_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    // Programa para encontrar os números pares em um número.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um número:");
        int numero = input.nextInt();

        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.println("Números pares: " + i);
            }
        }
    }


}
