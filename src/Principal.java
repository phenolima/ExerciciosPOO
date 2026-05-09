public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibeOlaMundo();

        Calculadora calc1 = new Calculadora();
        calc1.calculaDobro(8);

        Musica musica1 = new Musica();
        musica1.titulo = "Cordeiro Imolado";
        musica1.anoLancamento = 2023;
        musica1.artista = "Entretons";
        musica1.exibeFichaTecnica();

        musica1.avaliaMusica(8);
        musica1.avaliaMusica(10);

        System.out.println("A media das avaliacoes é: " + musica1.calculaMedia());


        Carro carro1 = new Carro();

        carro1.modelo = "Honda Civic";
        carro1.ano = 2024;
        carro1.cor = "Azul Marinho";

        carro1.exibeFichaTecnica();
        System.out.println("Idade do carro: " + carro1.calculaIdade() + " anos");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro Henrique";
        aluno1.idade = 28;

        aluno1.exibeInformacoes();
    }
}
