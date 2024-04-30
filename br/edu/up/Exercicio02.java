package br.edu.up;

// Exercicio02.java
import java.util.Scanner;

import br.edu.up.models.Automovel02;

public class Exercicio02 {

    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a distância percorrida: ");
        double distancia = scanner.nextDouble();

        System.out.println("Escreva o total de combustível consumido: ");
        double combustivel = scanner.nextDouble();

        Automovel02 automovel = new Automovel02(distancia, combustivel);

        System.out.println("O consumo médio é " + automovel.calcularConsumoMedio() + " km/l");

        scanner.close();
    }
}