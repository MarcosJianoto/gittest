package aprendizPoo5;

import aprendizPoo5.entities.Produto;

public class App {

    public static void main(String[] args) throws Exception {

        Produto prod1 = new Produto("TV", 650.00, 35);
        prod1.adicionar(5);

        prod1.remover(3);

        System.out.println("Preço antigo: " + prod1.getPrice());
        prod1.attPrice(350.00);

        System.out.println("Preço atual: " + prod1.getPrice());

        prod1.quantity();

    }
}
