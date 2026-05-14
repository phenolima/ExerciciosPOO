package br.com.alura.exerciciospoo.curso3.desafio3.questao6;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();

        ContaBancaria contaBancaria1 = new ContaBancaria(0001, 500);
        ContaBancaria contaBancaria2 = new ContaBancaria(0002, 600);
        ContaBancaria contaBancaria3 = new ContaBancaria(0003, 1650);
        ContaBancaria contaBancaria4 = new ContaBancaria(0004, 700);
        ContaBancaria contaBancaria5 = new ContaBancaria(0005, 800);

        contasBancarias.add(contaBancaria1);
        contasBancarias.add(contaBancaria2);
        contasBancarias.add(contaBancaria3);
        contasBancarias.add(contaBancaria4);
        contasBancarias.add(contaBancaria5);

        double maiorsaldo = 0;
        int contaMaiorSaldo = 0;

        for (ContaBancaria conta: contasBancarias){
            if (conta.getSaldo() > maiorsaldo){
                maiorsaldo = conta.getSaldo();
                contaMaiorSaldo = conta.getNumero();
            }
        }
        System.out.println("A conta com o maior saldo é: "+contaMaiorSaldo+
                " com o saldo no valor de "+maiorsaldo);
    }
}
