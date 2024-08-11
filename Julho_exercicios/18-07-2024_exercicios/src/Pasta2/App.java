package Pasta2;

import Pasta2.atributes.Color;
import Pasta2.entities.AnimalDomestico;
import Pasta2.entities.Cachorro;
import Pasta2.entities.Gato;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Gato:");
        Gato gato = new Gato("Gordinho", 5, "Vira lata", Color.BRANCO);
        System.out.println(gato);

        System.out.println();

        System.out.println("Cachorro:");
        Cachorro cachorro = new Cachorro("Pedrinho", 10, "Vira lata", Color.FRAJOLA);
        System.out.println(cachorro);

        System.out.println();

        AnimalDomestico cachorro2 = new Cachorro("Cachorrinho", 15, "Sem raça definida", Color.PRETO);
        System.out.println(cachorro2);

        System.out.println();
    }
}
