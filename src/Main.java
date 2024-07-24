public class Main {
    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa();
//        pessoa.mensagem();
//
//        Calculadora oDobro = new Calculadora();
//        oDobro.numero = 5;
//        System.out.println(oDobro.retornaODobro());

        Musica trilha1 = new Musica();
        trilha1.titulo = "Princesa teste";
        trilha1.artista = "Amado Batista";
        trilha1.anoLancamento = 1991;
        trilha1.avaliacao = 4;
        trilha1.numAvaliacoes = 2;

        trilha1.fichaTecnica();


    }
}