package aprendizPoo10.entities;

public class ContaPoupanca extends ContaCorrente {

    private double taxaDeJuros;

    public ContaPoupanca(int numeroConta, String titular, double saldo, double limite, double taxaDeJuros) {
        super(numeroConta, titular, saldo, limite);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return this.taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public String toString() {
        return "{" +
                " numeroConta='" + getNumeroConta() + "'" +
                ", titular='" + getTitular() + "'" +
                ", saldo='" + getSaldo() + "'" +
                ", limite='" + getLimite() + "'" +
                ", taxa de Juros='" + getTaxaDeJuros() + "'" +
                "}";
    }

}
