package aprendizPoo3.entities;

import java.text.Format;
import java.util.Objects;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro() {
    }

    public Cachorro(String name, Integer age, String species, String sexo, float weight, String raca) {
        super(name, age, species, sexo, weight);
        this.raca = raca;
    }

    public void latir() {
        System.out.println("auau");
    }

    @Override
    public String toString() {
        return String.format("name: %s %nage: %d %nspecie: %s %nweight: %f %nsexo: %s %nraca: %s",
                getName(), getAge(), getSpecies(), getWeight(), getSexo(), raca);
    }

}
