import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        double area = sala.calcularArea(2,3);
        double perimerto = sala.calcularPerimetro(2,3);
        System.out.println(area);
        System.out.println(perimerto);
    }
}
