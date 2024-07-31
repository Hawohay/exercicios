package generico.main;

import generico.Lista;

import java.util.ArrayList;

public class MainLista {
    public static void main(String[] args) {

        ArrayList<Lista> lista = new ArrayList<>();

        Lista primeiro = new Lista("Hawohay",41);
        Lista segundo = new Lista("Lúcia",37);
        Lista terceiro = new Lista("Mariana",2);
        Lista quarto = new Lista("Cecília",35);
        Lista quinto = new Lista("Paulo",28);

        lista.add(primeiro);
        lista.add(segundo);
        lista.add(terceiro);
        lista.add(quarto);
        lista.add(quinto);

        for (Lista listas : lista) {
            System.out.println(listas);
        }
    }
}
