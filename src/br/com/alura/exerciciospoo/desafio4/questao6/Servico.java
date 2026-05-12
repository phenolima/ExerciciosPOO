package br.com.alura.exerciciospoo.desafio4.questao6;

public class Servico implements Vendavel {
    private String descricao;
    private double precoHora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calculaPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicaDesconto(double percentualDesconto) {
        precoHora = precoHora - (precoHora * (percentualDesconto /100));
    }
}
