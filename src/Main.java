public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        Calculadora oDobro = new Calculadora();
        oDobro.numero = 5;
        System.out.println(oDobro.retornaODobro());

        Musica trilha1 = new Musica();
        trilha1.titulo = "Princesa teste";
        trilha1.artista = "Amado Batista";
        trilha1.anoLancamento = 1991;
        trilha1.avaliarMusica(4);
        trilha1.avaliarMusica(7);
        trilha1.avaliarMusica(8);
        trilha1.avaliarMusica(9);
        trilha1.avaliarMusica(9);

        trilha1.fichaTecnica();

        Musica trilha2 = new Musica();
        trilha1.titulo = "Sozinho";
        trilha2.artista = "Caetano Veloso";
        trilha2.anoLancamento = 1989;
        trilha2.avaliarMusica(8);
        trilha2.avaliarMusica(7);
        trilha2.avaliarMusica(8);
        trilha2.avaliarMusica(9);
        trilha2.avaliarMusica(9);

        trilha2.fichaTecnica();

    }
}