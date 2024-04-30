package br.edu.up;

import java.util.Scanner;
import br.edu.up.models.Dinheiro04;

public class Exercicio04 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double precoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares: ");
        double quantidadeDolar = scanner.nextDouble();

        Dinheiro04 dinheiro = new Dinheiro04(precoDolar, quantidadeDolar);

        System.out.println("O total em reais é: " + dinheiro.calcularTotalEmReais());

        scanner.close();
    }
}
