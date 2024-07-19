package Pasta2.entities;

import Pasta2.atributes.Color;

public class Cachorro extends AnimalDomestico {

    private Color color;

    public Cachorro(String name, int idade, String raca, Color color) {
        super(name, idade, raca);
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void brincar() {
        System.out.println("Saiu para brincar");
    }

    @Override
    public String toString() {
        return String.format("name: %s %nIdade: %d %nRaca: %s %nColor: %s ", getName(), getIdade(), getRaca(),
                getColor());

    }
}
