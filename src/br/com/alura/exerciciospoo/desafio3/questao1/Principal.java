package br.com.alura.exerciciospoo.desafio3.questao1;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Chevrolet Corsa");
        carro1.setPrecoAno1(30000);
        carro1.setPrecoAno2(40000);
        carro1.setPrecoAno3(50000);
        carro1.exibeInformacoes();
    }
}
