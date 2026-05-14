package br.com.alura.exerciciospoo.curso3.desafio3.questao23;

public class Cachorro extends Animal{
    private boolean vacinacao;
    private String nome;

    public boolean isVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(boolean vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
