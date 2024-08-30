import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App5 {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 200.00));
        list.add(new Product("Bike", 150.00));
        list.add(new Product("NOTEBOOK", 600.00));

        List<Product> expensiveProducts = list.stream().filter(p -> p.getPrice() < 500.00).collect(Collectors.toList());

        for (Product p : expensiveProducts) {
            System.out.println(p);
        }

    }
}
