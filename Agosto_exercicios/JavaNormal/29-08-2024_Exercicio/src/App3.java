import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App3 {
    public static void main(String[] args) throws Exception {

        List<Pessoa> list = new ArrayList<>();
        list.add(new Pessoa("Pedro", 300.00));
        list.add(new Pessoa("João", 200.00));
        list.add(new Pessoa("João", 800.00));

        // como aplicar desconto em vários produtos ao mesmo tempo.
        list.forEach((p -> p.setPrice(p.getPrice() * 0.9)));
        for (Pessoa p : list) {
            System.out.println(p);
        }

    }
}
