package aprendizPoo6.entities;

public class Funcionario {

    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private double imposto;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, String cargo, double salario, double imposto) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.imposto = imposto;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        if (salario > 0) {
            salario -= salario * (imposto / 100);
        }
        return salario;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", idade='" + getIdade() + "'" +
                ", cargo='" + getCargo() + "'" +
                ", salario='" + getSalario() + "'" +
                ", imposto='" + getImposto() + "'" +
                "}";
    }

}
