package calculo.main;

import calculo.Circulo;
import calculo.Forma;
import calculo.NumerosPrimos;
import calculo.Quadrado;

import java.util.ArrayList;

public class MainFormas {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();
        Forma quadrado = new Quadrado(6, 3);
        Forma circulo = new Circulo(12);

        formas.add(quadrado);
        formas.add(circulo);

        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}
