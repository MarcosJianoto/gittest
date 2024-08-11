package aprendizPoo4;

import aprendizPoo4.entities.ContaCorrente;

public class App {

    public static void main(String[] args) throws Exception {

        ContaCorrente contaCorrente = new ContaCorrente(50, 5000.00, "Pedro");
        System.out.println(contaCorrente);
        contaCorrente.sacar(5000.00);
        contaCorrente.consultaSaldo();

        contaCorrente.depositar(3000.00);
        contaCorrente.consultaSaldo();

    }
}
