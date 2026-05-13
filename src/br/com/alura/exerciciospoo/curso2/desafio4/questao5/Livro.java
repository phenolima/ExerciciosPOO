package br.com.alura.exerciciospoo.curso2.desafio4.questao5;

public class Livro extends Produto implements Calculavel{
    private int quantidadePaginas;
    private String autor;
    private int anoLancamento;
    private double impostoLivro;

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getImpostoLivro() {
        return impostoLivro;
    }

    public void setImpostoLivro(double impostoLivro) {
        this.impostoLivro = impostoLivro;
    }

    @Override
    public double calculaPrecoFinal() {
        return getPreco() * 1.70;
    }
}
