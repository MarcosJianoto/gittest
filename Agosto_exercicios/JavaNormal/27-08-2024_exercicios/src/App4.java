import java.util.ArrayList;
import java.util.List;

public class App4 {
    public static void main(String[] args) throws Exception {

        System.out.println("Teste lambda");
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 200.00));
        list.add(new Product("Bike", 150.00));

        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
    }
}
