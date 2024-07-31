package produto.main;

import produto.Produto;
import produto.ProdutoPerecivel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainProduto {
    public static void main(String[] args) {

        // Criação da lista de objetos Produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        // Criação de objetos produto.Produto
        Produto produto1 = new Produto("Sabão em pó", 1.5, 10);


        Produto produto2 = new Produto("arroz", 39.90, 5);


        Produto produto3 = new Produto("pasta de dente", 7.57, 20);

        // Criação de objeto produto.ProdutoPerecivel
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Manteiga", 7.0, 12);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date dataValidade = sdf.parse("01/01/2025");
            produtoPerecivel1.setDataValidade(dataValidade);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Adição dos objetos genericos.Pessoa à lista
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produtoPerecivel1);

        System.out.println();

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println();
        System.out.println("Quantidade de produtos na lista: " + produtos.size());
        System.out.println("-------------------------------------------------");
        System.out.println("Primeira pessoa da lista: " + produtos.get(2));

    }
}
