package br.com.alura.exerciciospoo.curso2.desafio4.questao6;

public class Produto implements Vendavel{
    private String nome;
    private double precoUnitario;

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double calculaPrecoTotal(int quantidade) {
        return quantidade * this.precoUnitario;
    }

    @Override
    public void aplicaDesconto(double percentualDesconto) {
        precoUnitario = precoUnitario - (precoUnitario * (percentualDesconto /100));
    }
}
