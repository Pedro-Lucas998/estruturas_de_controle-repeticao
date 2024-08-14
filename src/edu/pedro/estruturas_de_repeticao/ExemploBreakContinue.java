package edu.pedro.estruturas_de_repeticao;

public class ExemploBreakContinue {

    public static void main(String[] args) {
        // Números de 1 a 100 pulando os múltiplos de 5:
      /*  int numero = 100;

        for (int i = 1; i <= numero; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println("O número " + i + " não é múltiplo de 5.");
             }
      */

        // Imprime o nome dos funcionários até encontra um funcionário inválido
        String [] funcionarios = {"Rodrigo", "Alberto", "", "Pablo", "Álvares"};

        for (String funcionario : funcionarios){
            if (funcionario == ""){
                break;
            }
            System.out.println("Funciáro válido: " + funcionario);
        }
    }


}
