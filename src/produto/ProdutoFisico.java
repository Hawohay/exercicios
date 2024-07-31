package produto;

public class ProdutoFisico implements Calculavel {

    double valorSemDesconto;
    double desconto = 0.1;
    double precoFinal;

    public double getValorSemDesconto() {
        return valorSemDesconto;
    }

    public void setValorSemDesconto(double valorSemDesconto) {
        this.valorSemDesconto = valorSemDesconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    @Override
    public void calcularPrecoFinal(double valorSemDesconto) {
        precoFinal = valorSemDesconto - (valorSemDesconto * desconto);
    }
}
