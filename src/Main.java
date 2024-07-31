import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criação da lista de objetos Pessoa
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Criação de objetos Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Hawohay");
        pessoa1.setIdade(41);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Lúcia");
        pessoa2.setIdade(37);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Mariana");
        pessoa3.setIdade(2);

        // Adição dos objetos Pessoa à lista
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println();

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println();
        System.out.println("Quantidade de pessoas na lista: " + pessoas.size());
        System.out.println("-------------------------------------------------");
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0));

    }
}
