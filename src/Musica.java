//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e
//numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a
//média de avaliações.

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    public void fichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
    }

    public void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }

    public void setNumAvaliacoes(int numAvaliacoes) {
        this.numAvaliacoes = numAvaliacoes;
    }
}
