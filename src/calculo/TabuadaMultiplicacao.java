package calculo;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " * " + numero + " = " + (numero * i));
        }
    }
}
