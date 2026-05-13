package br.com.alura.exerciciospoo.curso2.desafio4.questao4;

public class Principal {
    public static void main(String[] args) {
        ConversorTempetaturaPadrao conversorTempetaturaPadrao = new ConversorTempetaturaPadrao();
        conversorTempetaturaPadrao.setTemperaturaCelsius(27);
        conversorTempetaturaPadrao.setTemperaturaFahrenheit(56);

        System.out.println(conversorTempetaturaPadrao.getTemperaturaCelsius() + " graus celsius equivale a " + conversorTempetaturaPadrao.celsiusParaFahrenheit() + " graus fahrenheit.");
        System.out.println(conversorTempetaturaPadrao.getTemperaturaFahrenheit() + " graus fahrenheit equivale a " + conversorTempetaturaPadrao.fahrenheitParaCelsius() + " graus celsius.");

    }
}
