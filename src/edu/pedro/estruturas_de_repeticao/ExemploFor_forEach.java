package edu.pedro.estruturas_de_repeticao;

public class ExemploFor_forEach {
    public static void main(String[] args) {
        String [] alunos = {"Carlos", "Alan", "Rafael", "Eduardo"};

       /* for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice " + x + " é " + alunos[x]);

        }
       */

        // Utilizando o for each:
        for (String aluno : alunos){
            System.out.println("Aluno: " + aluno);
        }
        // É mais agradável para com arrays.
    }
}
