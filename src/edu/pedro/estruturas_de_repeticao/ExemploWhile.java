package edu.pedro.estruturas_de_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double valorDisponivel = 200;
        double valorDoce;

        while (valorDisponivel > 0){
            valorDoce = valorAleatorio();
            if (valorDoce > valorDisponivel) {
                valorDoce = valorDisponivel;
            }
            valorDisponivel -= valorDoce;
            System.out.println("O doce de preço " + valorDoce + " foi adicionado.");
        }
        System.out.println("Valor disponível = " + valorDisponivel);
    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(10, 150);
    }
}
