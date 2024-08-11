package aprendizPoo6;

import aprendizPoo6.entities.Funcionario;

public class App {

    public static void main(String[] args) throws Exception {

        Funcionario funcionario = new Funcionario("Marcos", 25, "Gerente", 5000.00, 10);
        System.out.println(funcionario);
        funcionario.salarioLiquido();
        System.out.println(funcionario);
    }
}
