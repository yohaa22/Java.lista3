package br.edu.up.models;
public class Pessoa10 {
    private int idade;

    public Pessoa10(int idade) {
        this.idade = idade;
    }

    public String obterClassificacaoIdade() {
        if (idade >= 18) {
            return "maior de idade";
        } else {
            return "menor de idade";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
