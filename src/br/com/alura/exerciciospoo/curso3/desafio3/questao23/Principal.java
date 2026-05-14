package br.com.alura.exerciciospoo.curso3.desafio3.questao23;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Mike");
        cachorro.setVacinacao(true);
        cachorro.setBarulho("AUAUAUAU");

        Animal animal = (Animal) cachorro;


        if(animal instanceof Cachorro){
            System.out.println("Esse animal é um cachorro");
        }else {
            System.out.println("Nao é um cachorro");
        }

    }
}
