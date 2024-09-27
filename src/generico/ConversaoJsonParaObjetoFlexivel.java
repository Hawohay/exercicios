package generico;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record PessoaRecord3(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjetoFlexivel {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        PessoaRecord3 pessoa = gson.fromJson(jsonPessoa, PessoaRecord3.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
