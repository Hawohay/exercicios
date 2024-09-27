package generico;

import com.google.gson.Gson;

record EditoraRecord(String nome, String cidade) {}
record LivroRecord(String titulo, String autor, EditoraRecord editora) {}

public class ConversaoJsonAninhadoParaObjeto {

    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        LivroRecord livro = gson.fromJson(jsonLivro, LivroRecord.class);

        System.out.println("Objeto Livro: " + livro);
    }
}