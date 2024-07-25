public class Livro {
    private String titulo = "";
    private String autor = "";

    public void exibirDetalhes(){
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
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
}
