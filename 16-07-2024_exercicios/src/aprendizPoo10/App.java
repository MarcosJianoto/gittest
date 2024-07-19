package aprendizPoo10;

import aprendizPoo10.entities.ContaCorrente;
import aprendizPoo10.entities.ContaPoupanca;

public class App {

    public static void main(String[] args) throws Exception {

        ContaCorrente contaCorrente = new ContaCorrente(10, "Marcos", 500.00, 1000.00);

        contaCorrente.setLimite(3000);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(3000.00);

        System.out.println(contaCorrente);

        ContaPoupanca contaPoupanca = new ContaPoupanca(20, "Pedro", 150.00, 10000.00, 10.00);
        contaPoupanca.aplicarJuros();
        contaPoupanca.calcularJuros();
        contaPoupanca.depositar(5000.00);
        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.sacar(7000.00);
        System.out.println(contaPoupanca);

    }
}
