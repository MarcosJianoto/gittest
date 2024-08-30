import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 100.00));
        list.add(new Product("Celular", 200.00));

        list.sort(App2::compareProducts);
        list.forEach(System.out::println);

    }

    public static int compareProducts(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
