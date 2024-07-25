public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        String autor = livro1.getAutor();
        String titulo = livro1.getTitulo();

        System.out.println("Autor: " + autor + "<> " + "Título: " + titulo);

        livro1.setAutor("Hawohay");
        livro1.setTitulo("Codando em Java");

        livro1.exibirDetalhes();

    }
}