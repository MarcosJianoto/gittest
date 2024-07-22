package cargosempresa.entities;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String name, int idade, double salario, double bonus) {
        super(name, idade, Cargo.GERENTE, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcBonus() {
        return salario += salario * (bonus / 100);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", idade='" + getIdade() + "'" +
                ", cargo='" + getCargo() + "'" +
                ", salario='" + getSalario() + "'" +
                ", bonus='" + getBonus() + "'" +
                "}";
    }

}
