package edu.pedro.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        double valorSaldo = 900;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quanto você deseja sacar?");
        double valorSaque = input.nextDouble();

        if (valorSaque < valorSaldo) {
            valorSaldo -= valorSaque;
            System.out.println("Saldo atual: " + valorSaldo);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }


    }
}