//Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a
//exceção SenhaInvalidaException, uma classe de exceção personalizada que deve ser
//lançada caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).

package generico.main;

import generico.SenhaInvalidaException;

import java.util.Scanner;

public class MainSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma senha");
        String senha = scanner.nextLine();
        try {
            if (senha.length() < 8) {
                throw new SenhaInvalidaException("A senha deve conter no mínimo 8 caracteres");
            }
            System.out.println("A senha informada é válida!");
            System.out.println(senha);
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
        }
    }
}
