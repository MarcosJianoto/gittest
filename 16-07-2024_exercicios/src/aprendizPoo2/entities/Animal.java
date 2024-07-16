package aprendizPoo2.entities;

public class Animal {

    private String name;
    private Integer idade;
    private Tipo tipo;

    public Animal() {
    }

    public Animal(String name, Integer idade, Tipo tipo) {
        this.name = name;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String emitirSom() {
        String som = "Sem som";
        if (tipo.equals(tipo.MAMÍFERO)) {
            som = "Muu";
            System.out.println(som);
        } else if (tipo.equals(tipo.AVE)) {
            som = "Craaa";
            System.out.println(som);
        } else if (tipo.equals(tipo.RÉPTIL)) {
            som = "psisipsisspis";
            System.out.println(som);
        }
        return som;

    }

    public String seLocomover() {
        String movimento = "Parado";
        if (tipo.equals(tipo.MAMÍFERO)) {
            movimento = "Andando";
            System.out.println(movimento);
        } else if (tipo.equals(tipo.AVE)) {
            movimento = "Começou a voar";
            System.out.println(movimento);
        } else if (tipo.equals(tipo.RÉPTIL)) {
            movimento = "Começou a rastejar";
            System.out.println(movimento);
        }
        return movimento;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", idade='" + getIdade() + "'" +
                ", tipo='" + getTipo() + "'" +
                "}";
    }

}
