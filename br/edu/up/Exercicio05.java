package br.edu.up;
import java.util.Scanner;

import br.edu.up.models.Parcela05;

public class Exercicio05 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Escreva o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        Parcela05 parcela = new Parcela05(valorProduto);

        System.out.println("O preço da parcela é: " + parcela.calcularPrecoParcela());

        scanner.close();
    }
}
