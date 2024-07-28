import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversaoFinanceira conversor = new ConversorMoeda();
        double valorEmDolar = 222.0; // Valor em dólares que queremos converter
        double valorEmReal = conversor.converterDolarParaReal(valorEmDolar);
        System.out.println("Valor em Reais: " + valorEmReal);
    }
}
