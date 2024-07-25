public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Xepa de peixe");
        produto1.setPreco(100);
        System.out.println();
        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Preço original: " + produto1.getPreco());
        System.out.println();
        produto1.aplicarDesconto(10);

    }
}