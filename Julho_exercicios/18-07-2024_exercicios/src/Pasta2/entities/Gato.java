package Pasta2.entities;

import Pasta2.atributes.Color;

public class Gato extends AnimalDomestico {

    private Color color;

    public Gato(String name, int idade, String raca, Color color) {
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
        System.out.println("Miau");
    }

    @Override
    public void brincar() {
        System.out.println("Não gosta de brincar, somente dormir");
    }

    @Override
    public String toString() {
        return String.format("name: %s %nIdade: %d %nRaca: %s %nColor: %s ", getName(), getIdade(), getRaca(),
                getColor());

    }

}
