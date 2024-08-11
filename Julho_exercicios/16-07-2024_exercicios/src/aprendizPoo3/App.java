package aprendizPoo3;

import aprendizPoo3.entities.Cachorro;

public class App {

    public static void main(String[] args) throws Exception {

        String name = "Bob";
        Integer age = 10;
        String species = "cachorro";
        String sexo = "masc";
        float weight = 25;
        String raca = "Vira lata";

        Cachorro cachorro = new Cachorro(name, age, species, sexo, weight, raca);
        System.out.println(cachorro);

    }
}
