//3
public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numeroDeAvaliacoes;

    void exibeFichaTecnica(){
        String fichaTecnica = """
                ######## Ficha Tácnica ########
                Título: %s
                Artista: %s
                Ano de Lançamento: %d
                Avaliações: %f
                Número de Avaliaçoes: %d
                ################################
                """.formatted(titulo,artista,anoLancamento, somaAvaliacao,numeroDeAvaliacoes);
        System.out.println(fichaTecnica);
    }

    void avaliaMusica(double nota){
        somaAvaliacao += nota;
        numeroDeAvaliacoes++;
    }

    double calculaMedia(){
        return somaAvaliacao / numeroDeAvaliacoes;
    }
}
