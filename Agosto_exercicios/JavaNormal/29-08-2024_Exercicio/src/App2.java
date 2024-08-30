import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) throws Exception {

        List<Pessoa> list = new ArrayList<>();
        list.add(new Pessoa("Pedro", 300.00));
        list.add(new Pessoa("João", 200.00));
        list.add(new Pessoa("João", 800.00));

        List<Pessoa> especifico = list.stream().filter(p -> p.getPrice() > 500.00).collect(Collectors.toList());
        for (Pessoa p : especifico) {
            System.out.println(p);
        }

    }
}
