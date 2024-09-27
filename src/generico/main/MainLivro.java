package generico.main;

import com.google.gson.Gson;
import generico.Editora;
import generico.Livro;

public class MainLivro {
    public static void main(String[] args) {

        Editora editora = new Editora("Editora Clásicos", "Madrid");

        // JSON aninhado representando um livro
        String json = """
          {
            "titulo" : "Dom Quixote",
            "autor" : "Miguel de Cervantes"
          }
        """;

        // Cria um objeto Gson
        Gson gson = new Gson();

        // Desserializa o JSON para o objeto Livro
        Livro livro = gson.fromJson(json, Livro.class);

        // Atribui a editora manualmente ao objeto Livro
        livro.setEditora(editora);

        // Exibe o objeto Livro
        System.out.println(livro);
    }
}
