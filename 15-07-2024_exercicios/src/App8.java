import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App8 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Par ou Impar? ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();

    }
}
