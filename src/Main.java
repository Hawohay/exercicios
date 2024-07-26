import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o scanner uma vez fora do loop

        while (true) {
            // Instanciar GeradorDeNumero e gerar um número aleatório entre 1 e 100
            GeradorDeNumero gerarNumero = new GeradorDeNumero();
            int numeroGerado = gerarNumero.gerarNumeroAleatorio(1, 100);

            // Usar o método estático verificarPrimalidade da classe VerificadorDeNumeroPrimo
            boolean isPrimo = VerificadorDeNumeroPrimo.verificarPrimalidade(numeroGerado);

            // Exibir o resultado
            System.out.println("Número gerado: " + numeroGerado);
            System.out.println("É primo? " + (isPrimo ? "Sim" : "Não"));
            System.out.println();
            System.out.println("Gerar novo número?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            // Ler a resposta do usuário
            String resposta = scanner.nextLine();

            // Verificar a resposta e sair do loop se necessário
            if (resposta.equals("2")) {
                System.out.println("Programa encerrado.");
                break; // Sai do loop
            }
        }

        scanner.close(); // Fecha o scanner ao final do uso
    }
}
