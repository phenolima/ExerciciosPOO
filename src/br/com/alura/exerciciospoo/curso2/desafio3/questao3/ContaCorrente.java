package br.com.alura.exerciciospoo.curso2.desafio3.questao3;

public class ContaCorrente extends ContaBancaria{
    private double valortarifa;

    public void cobrarTarifaMensal(double valortarifa){
        saldo -= this.valortarifa;
    }
}
