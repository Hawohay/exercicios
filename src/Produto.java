public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentualDeDesconto){
        double desconto = percentualDeDesconto / 100;
        double valorComDesconto = preco - (preco * desconto);
        System.out.println("Percentual de desconto aplicado: " + desconto * 100 + "%");
        System.out.println("--------------------------------------------------------");
        System.out.println("Valor com o desconto: " + valorComDesconto);
    }

}
