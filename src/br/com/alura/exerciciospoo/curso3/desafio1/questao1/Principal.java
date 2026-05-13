package br.com.alura.exerciciospoo.curso3.desafio1.questao1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pedro Henrique");
        pessoa1.setIdade(28);
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Luciano Carneiro");
        pessoa2.setIdade(37);
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Leonardo Mota");
        pessoa3.setIdade(56);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("Tamanho da lista: "+pessoas.size()+" elementos");

        System.out.println("Primeiro da lista: "+pessoas.get(0));

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
