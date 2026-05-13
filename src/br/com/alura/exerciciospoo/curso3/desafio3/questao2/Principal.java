package br.com.alura.exerciciospoo.curso3.desafio3.questao2;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Mike");
        cachorro.setVacinacao(true);
        cachorro.setBarulho("AUAUAUAU");

        Animal animal = (Animal) cachorro;

    }
}
