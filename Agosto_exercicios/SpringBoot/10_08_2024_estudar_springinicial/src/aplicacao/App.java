package aplicacao;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa p1 = new Pessoa(1, "Marcos", "marcos@gmail.com");
        Pessoa p2 = new Pessoa(1, "João", "joao@gmail.com");
        Pessoa p3 = new Pessoa(1, "Pedro", "pedro@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
