package aprendizPoo4.entities;

public class ContaCorrente {

    private int numberConta;
    private Double saldo;
    private String name;

    public ContaCorrente(int numberConta, Double saldo, String name) {
        this.numberConta = numberConta;
        this.saldo = saldo;
        this.name = name;
    }

    public int getNumberConta() {
        return this.numberConta;
    }

    public void setNumberConta(int numberConta) {
        this.numberConta = numberConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depositar(Double value) {
        saldo += value;
    }

    public void sacar(Double value) {
        if (saldo != 0 && value <= saldo) {
            saldo -= value;
        } else if (value > saldo) {
            System.out.println("Você não tem " + value + " para sacar, tem somente: " + saldo);
        } else {
            System.out.println("Você está zerado!");
        }
    }

    public void consultaSaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }

    @Override
    public String toString() {
        return "{" +
                " numberConta='" + getNumberConta() + "'" +
                ", saldo='" + getSaldo() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

}
