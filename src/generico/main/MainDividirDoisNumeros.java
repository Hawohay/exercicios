package generico.main;

import java.util.Scanner;

public class MainDividirDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do dividendo");
        double dividendo = scanner.nextDouble();

        System.out.println("Informe o valor do divisor");
        double divisor = scanner.nextDouble();

        try {
            if (divisor == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida");
            }
            double quociente = dividendo / divisor;
            System.out.println("O resultado da divisão é: " + quociente);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
        }
    }
}
