//Desenvolva um programa em Java que permite aos usuários consultar informações sobre um
//usuário do GitHub (utilize a API pública do GitHub para obter os dados).
//Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException.
//Lance essa exceção quando o nome de usuário não for encontrado.No bloco catch, trate de forma
//específica essa exceção, exibindo uma mensagem amigável.

package generico.main;

import generico.ErroConsultaGitHubException;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.Scanner;

public class ConsultaUsuarioNoGitHub {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        System.out.println("Digite o nome do usuário para busca");
        var search = reading.nextLine();

        String address = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=3cf984d7";

        try {
            GitHub github = new GitHubBuilder().withOAuthToken("my_personal_token").build();

        } catch (ErroConsultaGitHubException | IOException e) {
            throw new RuntimeException(e);
        } finally {
            reading.close(); // Fecha o Scanner para evitar vazamento de recursos
        }
        System.out.println("Finalizado!");
    }
}

