package br.com.alura.exerciciospoo.desafio4.questao6;

public class Principal {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Playstation 5");
        produto.setPrecoUnitario(2000);
        System.out.println("O preco final do "+produto.getNome()+": " +produto.calculaPrecoTotal(2));
        produto.aplicaDesconto(50);
        System.out.println("O valor do "+produto.getNome()+" com desconto fica: "+produto.getPrecoUnitario());

        Servico servico = new Servico();
        servico.setDescricao("Pintura residencial");
        servico.setPrecoHora(5000);
        System.out.println("O preco final do "+servico.getDescricao()+": " +servico.calculaPrecoTotal(2));
        servico.aplicaDesconto(10);
        System.out.println("O valor do "+servico.getDescricao()+" com desconto fica: "+servico.getPrecoHora());
    }
}
