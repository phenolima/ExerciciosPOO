package br.com.alura.exerciciospoo.curso2.desafio3.questao3;

public class ContaBancaria {
    private String numero;
    private String banco;
    protected double saldo;

    public void depositar(double quantia){
        if (quantia == 0){
            System.out.println("A quantia preisa ser acima de zero");
        } else {
            saldo += quantia;
        }
    }

    public void sacar(double quantia){
        if (quantia > saldo){
            System.out.println("saldo insuficiente");
        } else {
            saldo -= quantia;
        }
    }

    public void exibirsaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }
}
