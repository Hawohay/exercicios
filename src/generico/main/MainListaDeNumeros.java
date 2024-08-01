package generico.main;

import generico.ListaDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainListaDeNumeros {
    public static void main(String[] args) {

        List<ListaDeNumeros> lista = new ArrayList<>(List.of(
                new ListaDeNumeros(10),
                new ListaDeNumeros(100),
                new ListaDeNumeros(25),
                new ListaDeNumeros(39),
                new ListaDeNumeros(11),
                new ListaDeNumeros(-1),
                new ListaDeNumeros(-12),
                new ListaDeNumeros(0)
        ));

        Collections.sort(lista);
        lista.sort(Comparator.comparing(ListaDeNumeros::getNumero));
        System.out.println(lista);

    }
}
