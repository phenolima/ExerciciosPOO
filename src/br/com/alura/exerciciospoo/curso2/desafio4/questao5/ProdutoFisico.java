package br.com.alura.exerciciospoo.curso2.desafio4.questao5;

public class ProdutoFisico extends Produto implements Calculavel{
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaPrecoFinal() {
        return getPreco() * 3;
    }
}
