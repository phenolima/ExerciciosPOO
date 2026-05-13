package br.com.alura.exerciciospoo.curso2.desafio4.questao1;

public class ConversorMoeda implements ConversaoFinanceira{
     private double taxaDeCambio;

    public double getTaxaDeCambio() {
        return taxaDeCambio;
    }

    public void setTaxaDeCambio(double taxaDeCambio) {
        this.taxaDeCambio = taxaDeCambio;
    }

    @Override
    public double converteDolarParaReal(double valor) {
        return taxaDeCambio * valor;
    }
}
