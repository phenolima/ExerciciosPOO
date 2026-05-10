package br.com.alura.exerciciospoo.desafio1;

//5
public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes(){
        String infoAlunos = """
                ######## Informacoes ########
                Nome: %s
                Idade: %d
                ################################
                """.formatted(nome,idade);

        System.out.println(infoAlunos);
    }
}
