import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Pessoa> list = new ArrayList<>();
        list.add(new Pessoa("Marcos", 500.00));
        list.add(new Pessoa("joao", 300.00));
        list.add(new Pessoa("Pedro", 550.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Pessoa p : list) {
            System.out.println(p);
        }

    }
}
