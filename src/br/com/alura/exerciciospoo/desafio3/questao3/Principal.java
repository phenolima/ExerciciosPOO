package br.com.alura.exerciciospoo.desafio3.questao3;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(1000);
        contaCorrente.depositar(10000);
        contaCorrente.cobrarTarifaMensal(10);
        contaCorrente.exibirsaldo();
    }
}
