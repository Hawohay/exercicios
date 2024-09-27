package generico;

import com.google.gson.Gson;

record PessoaRecord2(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjeto {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        PessoaRecord2 pessoa = gson.fromJson(jsonPessoa, PessoaRecord2.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}