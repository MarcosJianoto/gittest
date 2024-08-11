package aprendizPoo3.entities;

public class Animal {

    private String name;
    private Integer age;
    private String species;
    private String sexo;
    private float weight; // peso

    public Animal() {
    }

    public Animal(String name, Integer age, String species, String sexo, float weight) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.sexo = sexo;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
