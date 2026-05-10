import br.com.alura.exerciciospoo.desafio2.*;


public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta("1230101-9");
        conta1.setSaldo(1000);
        conta1.setTitular("João");

        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Titular: " + conta1.getTitular());

        conta1.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta1.getSaldo());


        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Pedro Henrique");
        pessoa1.setIdade(28);

        pessoa1.verificaMaioridade();

        Produto produto1 = new Produto();
        produto1.setNome("Playstatio 5");
        produto1.setPreco(5000);

        System.out.println("O valor do produdo após o desconto é: " + produto1.aplicaDesconto(50));


        Aluno aluno1 = new Aluno();
        aluno1.setNome("Cristiano Ronaldo");
        aluno1.setNotas(new double[]{10,1,10});

        System.out.println("A média do aluno: "+ aluno1.getNome() + " é: " + aluno1.calculaMedia());

        Livro livro1 = new Livro();
        livro1.setTitulo("Memórias Póstumas de Brás Cubas");
        livro1.setAutor("Machado de Assis");
        livro1.exibeDetalhes();
    }
}
