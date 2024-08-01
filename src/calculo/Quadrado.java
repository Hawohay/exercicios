package calculo;

public class Quadrado implements Forma {

    private double base;
    private double altura;

    public Quadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Quadrado com base " + base + " e altura " + altura + " tem área: " + calcularArea();
    }
}
