package br.com.alura.exerciciospoo.curso2.desafio4.questao2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calculaArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calculaPerimetro(double altura, double largura) {
        return 2 * (altura + largura);
    }
}
