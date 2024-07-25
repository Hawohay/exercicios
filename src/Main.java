public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        Calculadora oDobro = new Calculadora();
        oDobro.numero = 5;
        System.out.println(oDobro.retornaODobro());
        System.out.println();

        Musica trilha1 = new Musica();
        trilha1.titulo = "Princesa";
        trilha1.artista = "Amado Batista";
        trilha1.anoLancamento = 1991;
        trilha1.avaliarMusica(4);
        trilha1.avaliarMusica(7);
        trilha1.avaliarMusica(8);
        trilha1.avaliarMusica(9);
        trilha1.avaliarMusica(9);

        trilha1.fichaTecnica();
        System.out.println();

        Musica trilha2 = new Musica();
        trilha2.titulo = "Sozinho";
        trilha2.artista = "Caetano Veloso";
        trilha2.anoLancamento = 1989;
        trilha2.avaliarMusica(8);
        trilha2.avaliarMusica(7);
        trilha2.avaliarMusica(8);
        trilha2.avaliarMusica(9);
        trilha2.avaliarMusica(9);

        trilha2.fichaTecnica();
        System.out.println();

        Carro carro1 = new Carro();
        carro1.modelo = ("Fusca");
        carro1.ano = 1998;
        carro1.cor = ("Vermelho");
        carro1.fichaTecnica();

        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.endereco = "Rua A, 123";
        aluno.cpf = "123.456.789-00";
        aluno.dataNascimento = "1983/01/15";
        aluno.exibeDados();

    }
}