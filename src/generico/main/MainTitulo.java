package generico.main;

import generico.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class MainTitulo {
    public static void main(String[] args) {

        ArrayList<Titulo> list = new ArrayList<>();

        Titulo um = new Titulo("Aprimeiro");
        Titulo dois = new Titulo("Bsegundo");
        Titulo tres = new Titulo("Cterceiro");
        Titulo quatro = new Titulo("Dquarto");

        list.add(um);
        list.add(dois);
        list.add(tres);
        list.add(quatro);

        Collections.sort(list);
        System.out.println(list);

    }
}
