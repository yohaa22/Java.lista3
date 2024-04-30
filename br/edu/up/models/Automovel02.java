package br.edu.up.models;

public class Automovel02 {
    private double distanciaPercorrida;
    private double combustivelConsumido;

    public Automovel02(double distancia, double combustivel) {
        this.distanciaPercorrida = distancia;
        this.combustivelConsumido = combustivel;
    }

    public double calcularConsumoMedio() {
        return distanciaPercorrida / combustivelConsumido;
    }

    // Getters e setters para os campos privados
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getCombustivelConsumido() {
        return combustivelConsumido;
    }

    public void setCombustivelConsumido(double combustivelConsumido) {
        this.combustivelConsumido = combustivelConsumido;
    }
}



 

