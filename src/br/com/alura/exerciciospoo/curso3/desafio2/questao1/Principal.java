package br.com.alura.exerciciospoo.curso3.desafio2.questao1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Desodorante", 10, 5);
        Produto produto2 = new Produto("Sabonete", 5, 10);
        Produto produto3 = new Produto("Shampoo", 30, 3);
        ProdutoPerecivel produto4 = new ProdutoPerecivel("Queijo Minas", 50, 10, "13/06/2026");
        Produto produto5 = produto1;

        ArrayList<Produto> produtos = new ArrayList();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        System.out.println("Tamanho da Lista: "+produtos.size()+" itens");
        System.out.println(produtos);

    }
}
