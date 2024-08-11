import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App11 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite um numero: ");
        int n = random.nextInt(100) + 1;

        System.out.println("Tabuada do numero: " + n);
        for (int i = 0; i <= 10000000; i++) {
            System.out.println(n + " * " + i + " = " + n * i);

        }

        sc.close();

    }
}
