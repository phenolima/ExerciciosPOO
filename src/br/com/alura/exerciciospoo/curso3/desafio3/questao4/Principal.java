package br.com.alura.exerciciospoo.curso3.desafio3.questao4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("Escova de dente", 20);
        Produto produto2 = new Produto("barbeador eletrico", 100);
        Produto produto3 = new Produto("Toalha", 40);
        Produto produto4 = new Produto("Sabonete", 5);
        Produto produto5 = new Produto("Shampoo", 120);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        double somaPrecoProdutos = 0;

        for(Produto item: produtos){
            somaPrecoProdutos += item.getPreco();
        }
        double mediaPrecoProdutos = somaPrecoProdutos / produtos.size();
        System.out.println("A soma dos valores é: "+somaPrecoProdutos);
        System.out.println("A media de preco dos produtos da lista é: "+mediaPrecoProdutos);
    }
}
