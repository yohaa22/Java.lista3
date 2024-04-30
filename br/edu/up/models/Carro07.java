package br.edu.up.models;
public class Carro07 {
    private double custoFabrica;
    private final double percentualDistribuidor = 0.28; 
    private final double impostos = 0.45; 

    public Carro07(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double custoImpostos = custoFabrica * impostos;
        double custoDistribuidor = (custoFabrica + custoImpostos) * percentualDistribuidor;
        return custoFabrica + custoImpostos + custoDistribuidor;
    }

    // Getters e setters
    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }
}
