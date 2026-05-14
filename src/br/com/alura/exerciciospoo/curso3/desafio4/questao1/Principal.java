package br.com.alura.exerciciospoo.curso3.desafio4.questao1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(65);
        numeros.add(67);
        numeros.add(24);
        numeros.add(87);
        numeros.add(456);
        numeros.add(245);
        numeros.add(212);
        numeros.add(839);
        numeros.add(676);

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
