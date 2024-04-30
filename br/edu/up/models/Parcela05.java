package br.edu.up.models;
public class Parcela05 {
    private double valorCompra;

    public Parcela05(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double calcularPrecoParcela() {
        return valorCompra / 5;
    }

    // Getters e setters
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
