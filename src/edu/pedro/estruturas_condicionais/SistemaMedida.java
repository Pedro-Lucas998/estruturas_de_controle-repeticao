package edu.pedro.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o tamanho da sua roupa? (p,m,g):");
        char tamanho = input.next().charAt(0);

        switch (tamanho){
            case 'p':{
                System.out.println("Tamanho: pequeno");
                break;
            }
            case 'm':{
                System.out.println("Tamanho: médio");
                break;
            }
            case 'g':{
                System.out.println("Tamanho: grande");
                break;
            }
            default:{
                System.out.println("Incompatível");
            }

        }
        // Não seria "bom" substituir o if pelo  switch case nesse exemplo.
    }

}
