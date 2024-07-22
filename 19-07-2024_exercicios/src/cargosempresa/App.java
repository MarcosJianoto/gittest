package cargosempresa;

import cargosempresa.entities.Funcionario;
import cargosempresa.entities.Gerente;
import cargosempresa.entities.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {

        Gerente gerente = new Gerente("Marcos", 30, 2500.00, 10);
        System.out.println(gerente);
        System.out.println(gerente.calcBonus());

        Funcionario vendedor1 = new Vendedor("Pedro", 35, 3500.00, 30);
        System.out.println(vendedor1);

    }
}
