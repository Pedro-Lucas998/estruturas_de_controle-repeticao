package edu.pedro.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua nota: ");
        double notaAluno = input.nextDouble();

       /* if (notaAluno >= 7) {
            System.out.println("Aprovado.");
        }
        else if(notaAluno >= 5){
            System.out.println("Prova de recuperação.");
        }
        else{
            System.out.println("Reprovado.");
        }
       */

        String resultado = notaAluno >= 7 ? "Aprovado." : notaAluno>=5 ? "Prova Recuperação." : "Reprovado.";

        System.out.println(resultado);

    }
}
