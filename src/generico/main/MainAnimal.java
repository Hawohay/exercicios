package generico.main;

import generico.Animal;
import generico.Cachorro;

public class MainAnimal {
    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();
        Animal meuAnimal = (Animal) meuCachorro;

        if (meuAnimal instanceof Animal) {
            meuAnimal.emitirSom();
        }
    }
}
