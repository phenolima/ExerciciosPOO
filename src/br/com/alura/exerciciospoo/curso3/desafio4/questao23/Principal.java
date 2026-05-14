package br.com.alura.exerciciospoo.curso3.desafio4.questao23;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        List<Titulo> titulos = new ArrayList<>();

        Titulo titulo1 = new Titulo("Os Vingadores");
        Titulo titulo2 = new Titulo("Os Sem Floresta");
        Titulo titulo3 = new Titulo("Matrix");
        Titulo titulo4 = new Titulo("Tarzan");
        Titulo titulo5 = new Titulo("A Cabana");
        Titulo titulo6 = new Titulo("Resgate do Soldado Rayan");

        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(titulo4);
        titulos.add(titulo5);
        titulos.add(titulo6);

        System.out.println("Desordenados:");
        System.out.println(titulos);

        System.out.println("Ordenados:");
        Collections.sort(titulos);
        System.out.println(titulos);
    }
}
