package br.com.alura.exerciciospoo.curso3.desafio3.questao1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pedro");
        lista.add("Henrique");
        lista.add("Oliveira");
        lista.add("Lima");

        for (String item: lista){
            System.out.println(item);
        }
    }
}
