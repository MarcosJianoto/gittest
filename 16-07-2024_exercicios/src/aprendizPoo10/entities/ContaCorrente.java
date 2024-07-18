package aprendizPoo10.entities;

public class ContaCorrente {

    private int numeroConta;
    private String titular;
    private double saldo;
    private double limite;

    public ContaCorrente() {
    }

    public ContaCorrente(int numeroConta, String titular, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "{" +
                " numeroConta='" + getNumeroConta() + "'" +
                ", titular='" + getTitular() + "'" +
                ", saldo='" + getSaldo() + "'" +
                ", limite='" + getLimite() + "'" +
                "}";
    }

}
