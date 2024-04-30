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

            case 5:
                Exercicio05.Executar();
                break;

            case 6:
                Exercicio06.Executar();
                break;

            case 7:
                Exercicio07.Executar();
                break;

            case 8:
                Exercicio08.Executar();
                break;

            case 9:
                Exercicio09.Executar();
                break;

                case 10:
                Exercicio10.Executar();
                break;

                case 11:
                Exercicio11.Executar();
                break;

                case 12:
                Exercicio12.Executar();
                break;

                case 13:
                Exercicio13.Executar();
                break;
                
                case 14:
                Exercicio14.Executar();
                break;

                case 15:
                Exercicio15.Executar();
                break;

                case 16:
                Exercicio16.Executar();
                break;

                case 17:
                Exercicio17.Executar();
                break;

                case 18:
                Exercicio18.Executar();
                break;

                case 19:
                Exercicio19.Executar();
                break;

                case 20:
                Exercicio20.Executar();
                break;

                case 21:
                Exercicio21.Executar();
                break;

                case 22:
                Exercicio22.Executar();
                break;

                case 23:
                Exercicio23.Executar();
                break;

                case 24:
                Exercicio24.Executar();
                break;












            default:
                break;
        }

    }
}