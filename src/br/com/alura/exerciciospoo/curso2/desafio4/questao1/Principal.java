package br.com.alura.exerciciospoo.curso2.desafio4.questao1;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.setTaxaDeCambio(5);
        System.out.println("o valor em real é: " +conversorMoeda.converteDolarParaReal(10));
    }
}
