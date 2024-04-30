package br.edu.up;

import br.edu.up.utils.Prompt;

public class Programa {

    public static void main(String[] args) {

        int numero = Prompt.lerInteiro("Digite o Numero do Exercicio:");

      switch (numero) {
          case 1:
              Exercicio01.Executar();
              break;
      
              case 2:
              Exercicio02.Executar();
              break;

               case 3:
               Exercicio03.Executar();
               break;

               case 4:
               Exercicio04.Executar();
               break;


              default:
              break;
      }
      
  }
}