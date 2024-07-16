package aprendizPoo1;

import aprendizPoo1.entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("Marcos", "Rua 8", 25);
        System.out.println(pessoa);

        Pessoa pessoa2 = new Pessoa("João", "Rua 8", 35);
        System.out.println(pessoa2);

    }
}
