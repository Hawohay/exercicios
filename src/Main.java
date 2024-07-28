

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.calcularPrecoFinal(100);
        System.out.println(livro1.getPrecoFinal());

        ProdutoFisico produto1 = new ProdutoFisico();
        produto1.calcularPrecoFinal(100);
        System.out.println(produto1.getPrecoFinal());

    }
}
