package br.edu.up.models;

public class Produto14 {
    private double precoCusto;
    private double precoVenda;

    public Produto14(double precoCusto, double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String verificarLucroOuPrejuizo() {
        if (precoVenda > precoCusto) {
            return "Lucro";
        } else if (precoVenda < precoCusto) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }
}
