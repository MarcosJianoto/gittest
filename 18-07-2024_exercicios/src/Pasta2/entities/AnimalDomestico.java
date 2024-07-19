package Pasta2.entities;

public abstract class AnimalDomestico {

    private String name;
    private int idade;
    private String raca;

    public AnimalDomestico() {
    }

    public AnimalDomestico(String name, int idade, String raca) {
        this.name = name;
        this.idade = idade;
        this.raca = raca;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void emitirSom() {
    }

    public void brincar() {
    }
}
