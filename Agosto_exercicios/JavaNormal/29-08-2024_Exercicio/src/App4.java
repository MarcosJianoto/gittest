import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App4 {
    public static void main(String[] args) throws Exception {

        List<Pessoa> list = new ArrayList<>();
        list.add(new Pessoa("Pedro", 300.00));
        list.add(new Pessoa("João", 200.00));
        list.add(new Pessoa("João", 800.00));
        list.add(new Pessoa("Laptop", 500.00));

        List<Pessoa> listLaptop = list.stream().filter(p -> p.getName().contains("Laptop")).toList();
        System.out.println(listLaptop);

    }
}
