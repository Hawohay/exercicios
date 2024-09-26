package generico.main;

import com.google.gson.Gson;
import generico.Editora;
import generico.Livro;

public class MainLivro {
    public static void main(String[] args) {

        Editora editora = new Editora("Editora Clásicos", "Madrid");

        // JSON aninhado representando um livro com a editora
        String json = """
          {
            "titulo" : "Dom Quixote",
            "autor" : "Miguel de Cervantes",
            "editora" : {
              "nome" : "Editora Clássicos",
              "cidade" : "Madrid"
            }
          }
        """;

        // Cria um objeto Gson
        Gson gson = new Gson();

        // Desserializa o JSON para o objeto Livro
        Livro livro = gson.fromJson(json, Livro.class);

        // Exibe o objeto Livro
        System.out.println(livro);
    }
}
