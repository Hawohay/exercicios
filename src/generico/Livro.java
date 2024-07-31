package generico;

public class Livro implements Calculavel {

    private String titulo = "";
    private String autor = "";

    double valorSemDesconto;
    double desconto = 0.4;
    double precoFinal;

    public void exibirDetalhes() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
    }

    public double getValorSemDesconto() {
        return valorSemDesconto;
    }

    public void setValorSemDesconto(double valorSemDesconto) {
        this.valorSemDesconto = valorSemDesconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void calcularPrecoFinal(double valorSemDesconto) {
        precoFinal = valorSemDesconto - (valorSemDesconto * desconto);
    }
}
