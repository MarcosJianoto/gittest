import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Produto 1", 500.00));
        list.add(new Product("TV", 300.00));

        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
