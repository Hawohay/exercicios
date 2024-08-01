package generico.main;

import generico.Lista;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLista {
    public static void main(String[] args) {

        List<Lista> lista = new ArrayList<>();

        Lista primeiro = new Lista("Hawohay", 41);
        Lista segundo = new Lista("Lúcia", 37);
        Lista terceiro = new Lista("Mariana", 2);
        Lista quarto = new Lista("Cecília", 35);
        Lista quinto = new Lista("Paulo", 28);

        lista.add(primeiro);
        lista.add(segundo);
        lista.add(terceiro);
        lista.add(quarto);
        lista.add(quinto);

        for (Lista listas : lista) {
            System.out.println(listas);
        }

        List<Lista> arrayList = new ArrayList<>(List.of(
                new Lista("Hawohay", 41),
                new Lista("Hawohay", 42),
                new Lista("Hawohay", 43),
                new Lista("Hawohay", 40),
                new Lista("Hawohay", 32),
                new Lista("Hawohay", 12),
                new Lista("Hawohay", 47),
                new Lista("Hawohay", 43)

        ));

        List<Lista> linkedList = new LinkedList<>(List.of(
                new Lista("H", 41),
                new Lista("Ha", 42),
                new Lista("Haw", 43),
                new Lista("Hawo", 40),
                new Lista("Hawoh", 32),
                new Lista("Hawoha", 12),
                new Lista("Hawohay", 47),
                new Lista("y", 43)
        ));

        for (Lista lista1 : arrayList) {
            System.out.println(lista1.getAge() + lista1.getName());
        }

        for (Lista lista1 : linkedList) {
            System.out.println(lista1.getAge() + lista1.getName());
        }

        // Utilizando e imprimindo arrayList
        System.out.println("Usando ArrayList:");
        imprimirLista(arrayList);

        // Utilizando e imprimindo linkedList
        System.out.println("Usando LinkedList:");
        imprimirLista(linkedList);

    }

    // Método para imprimir os elementos da lista
    public static void imprimirLista(List<Lista> lista) {
        for (Lista lista1 : lista) {
            System.out.println(lista1.getAge() + " " + lista1.getName());
        }

    }
}
