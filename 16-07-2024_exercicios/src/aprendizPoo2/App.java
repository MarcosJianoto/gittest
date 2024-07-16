package aprendizPoo2;

import aprendizPoo2.entities.Animal;
import aprendizPoo2.entities.Tipo;

public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Ave", 10, Tipo.AVE);
        System.out.println(animal);
        animal.emitirSom();
        animal.seLocomover();
    }
}
