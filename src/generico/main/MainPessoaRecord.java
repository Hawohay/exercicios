package generico.main;

import com.google.gson.*;
import generico.PessoaRecord;

import java.lang.reflect.Type;

public class MainPessoaRecord {
    public static void main(String[] args) {
        // JSON incluindo o campo email
        String json = """
          {
            "nome" : "João",
            "idade" : 30,
            "cidade" : "João Pessoa",
            "email" : "joao@example.com"
          }
        """;

        // Cria o deserializador customizado
        JsonDeserializer<PessoaRecord> deserializer = new JsonDeserializer<>() {
            @Override
            public PessoaRecord deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
                    throws JsonParseException {
                JsonObject jsonObject = jsonElement.getAsJsonObject();

                // Extrai os campos obrigatórios
                String nome = jsonObject.get("nome").getAsString();
                int idade = jsonObject.get("idade").getAsInt();
                String cidade = jsonObject.get("cidade").getAsString();

                // Extrai o campo "email" se estiver presente
                String email = jsonObject.has("email") ? jsonObject.get("email").getAsString() : "Email não informado";

                // Log ou uso do email
                System.out.println("Email: " + email);

                // Retorna o objeto PessoaRecord
                return new PessoaRecord(nome, idade, cidade);
            }
        };

        // Configura o Gson com o deserializador customizado
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(PessoaRecord.class, deserializer)
                .create();

        // Desserializa o JSON para o objeto PessoaRecord
        PessoaRecord pessoa = gson.fromJson(json, PessoaRecord.class);

        // Exibe o objeto PessoaRecord
        System.out.println(pessoa);
    }
}
