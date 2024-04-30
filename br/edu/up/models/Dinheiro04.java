package br.edu.up.models;

public class Dinheiro04 {
    private double precoDolar;
    private double quantidadeDolar;

    public Dinheiro04(double precoDolar, double quantidadeDolar) {
        this.precoDolar = precoDolar;
        this.quantidadeDolar = quantidadeDolar;
    }

    public double calcularTotalEmReais() {
        return precoDolar * quantidadeDolar;
    }

    // Getters e setters
    public double getPrecoDolar() {
        return precoDolar;
    }

    public void setPrecoDolar(double precoDolar) {
        this.precoDolar = precoDolar;
    }

    public double getQuantidadeDolar() {
        return quantidadeDolar;
    }

    public void setQuantidadeDolar(double quantidadeDolar) {
        this.quantidadeDolar = quantidadeDolar;
    }
}


