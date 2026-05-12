package br.com.alura.exerciciospoo.desafio4.questao2;

public class Principal {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.setAltura(10);
        calculadoraSalaRetangular.setLargura(5);
        System.out.println("A área do retangulo é: " + calculadoraSalaRetangular.calculaArea(calculadoraSalaRetangular.getAltura(), calculadoraSalaRetangular.getLargura()));
        System.out.println("O perimetro do retangulo é: " + calculadoraSalaRetangular.calculaPerimetro(calculadoraSalaRetangular.getAltura(), calculadoraSalaRetangular.getLargura()));
    }
}
