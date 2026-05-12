package br.com.alura.exerciciospoo.desafio4.questao5;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("Capitaes de Areia");
        livro.setPreco(70);
        System.out.println("Livro: "+livro.getNome()+" | Valor final: "+livro.calculaPrecoFinal());

        Livro livro1 = new Livro();
        livro1.setNome("Biblia");
        livro1.setPreco(100);
        System.out.println("Livro: "+livro1.getNome()+" | Valor final: "+livro1.calculaPrecoFinal());

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setNome("Parafusadeira");
        produtoFisico.setPreco(400);
        System.out.println("Produto: "+produtoFisico.getNome()+" | Valor final: "+produtoFisico.calculaPrecoFinal());

    }
}
