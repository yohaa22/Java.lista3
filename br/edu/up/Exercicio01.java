package br.edu.up;

// Exercicio01.java
import java.util.Scanner;

import br.edu.up.models.Aluno01;

public class Exercicio01 {

    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();
        
        // Adicionando a declaração de importação da classe Aluno
        var aluno = new Aluno01(nome, nota1, nota2, nota3);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());

        scanner.close();
    }
}

