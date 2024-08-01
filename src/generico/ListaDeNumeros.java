package generico;

public class ListaDeNumeros implements Comparable<ListaDeNumeros>{

    private int numero;

    public ListaDeNumeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(ListaDeNumeros outroNumero) {
        return 0;
    }

    @Override
    public String toString() {
        return "Número: " + this.getNumero();
    }
}
