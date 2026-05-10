package br.com.alura.exerciciospoo.desafio2;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calculaMedia(){
        return Arrays.stream(notas).sum() / notas.length;
    }
}
