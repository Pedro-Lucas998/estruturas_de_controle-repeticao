package edu.pedro.estruturas_de_repeticao;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        do {
            System.out.println("O telefone está tocando...");

        }
        while(atender());
        System.out.println("Você atendeu o telefone.");
    }

    public static boolean atender(){
        boolean atendeu = new Random().nextInt(5)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
