package cargosempresa.entities;

public abstract class Funcionario {

    private String name;
    private int idade;
    private Cargo cargo;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String name, int idade, Cargo cargo, double salario) {
        this.name = name;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
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

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", idade='" + getIdade() + "'" +
            ", cargo='" + getCargo() + "'" +
            ", salario='" + getSalario() + "'" +
            "}";
    }


}
