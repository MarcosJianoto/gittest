import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App6 {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 200.00));
        list.add(new Product("Bike", 150.00));
        list.add(new Product("NOTEBOOK", 600.00));

        List<Product> listNew = list.stream().filter(p -> p.getPrice() < 500.00).collect(Collectors.toList());
        listNew.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for (Product p : listNew) {
            System.out.println(p.getPrice());
        }

        

    }
}
