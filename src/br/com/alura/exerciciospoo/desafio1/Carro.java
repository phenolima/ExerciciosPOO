package br.com.alura.exerciciospoo.desafio1;//4
import java.time.Year;

public class Carro {

    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        String fichaTecnica = """
                ######## Ficha Tácnica ########
                Modelo: %s
                Ano: %d
                Cor: %s
                ################################
                """.formatted(modelo,ano,cor);

        System.out.println(fichaTecnica);
    }

    int calculaIdade(){
        int anoCorrente = Year.now().getValue();
        return anoCorrente - ano;
    }
}
