package generico;

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes = 0;

    public void fichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + mediaAvaliacoes());
    }

    public void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }

}
