package br.com.alura.exerciciospoo.desafio2;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicaDesconto(double percentualDesconto){
        return preco - (preco * (percentualDesconto / 100));
    }
}
