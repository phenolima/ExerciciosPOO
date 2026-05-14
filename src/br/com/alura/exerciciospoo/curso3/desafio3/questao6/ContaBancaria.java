package br.com.alura.exerciciospoo.curso3.desafio3.questao6;

public class ContaBancaria {
    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
}
