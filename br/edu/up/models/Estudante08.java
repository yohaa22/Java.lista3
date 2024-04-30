package br.edu.up.models;

public class Estudante08 {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudante08(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String obterMencao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media <= 5.0) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
