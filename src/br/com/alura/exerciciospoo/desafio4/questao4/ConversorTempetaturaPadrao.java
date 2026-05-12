package br.com.alura.exerciciospoo.desafio4.questao4;

public class ConversorTempetaturaPadrao implements ConversorTemperatura{
    private double temperaturaCelsius;
    private double temperaturaFahrenheit;

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }

    public void setTemperaturaFahrenheit(double getTemperaturaFahrenheit) {
        this.temperaturaFahrenheit = getTemperaturaFahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return 1.8 * temperaturaCelsius + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (temperaturaFahrenheit - 32) / 1.8;
    }
}
