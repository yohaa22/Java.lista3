package br.edu.up;
import java.util.Scanner;

import br.edu.up.models.Carro07;

public class Exercicio07 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        Carro07 carro = new Carro07(custoFabrica);
        double custoConsumidor = carro.calcularCustoConsumidor();

        System.out.println("O custo ao consumidor do carro é: " + custoConsumidor);

        scanner.close();
    }
}
