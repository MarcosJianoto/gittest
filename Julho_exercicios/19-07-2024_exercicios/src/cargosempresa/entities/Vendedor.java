package cargosempresa.entities;

public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(String name, int idade, double salario, double comissao) {
        super(name, idade, Cargo.VENDEDOR, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcComissao() {
        return salario += salario * (comissao / 100);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", idade='" + getIdade() + "'" +
                ", cargo='" + getCargo() + "'" +
                ", salario='" + getSalario() + "'" +
                ", comissao='" + getComissao() + "'" +
                "}";
    }

}
