package br.com.alura.exerciciospoo.curso3.desafio3.questao5;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList();

        Circulo circulo1= new Circulo(2);
        Quadrado quadrado1 = new Quadrado(4);

        formas.add(circulo1);
        formas.add(quadrado1);

        for(Forma forma: formas){
            System.out.println("A area é: "+forma.calcularArea());
        }
    }
}
