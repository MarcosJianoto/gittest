package AppsSimples;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        // Quadrado de números:
        double n = sc.nextDouble();
        double result = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " elevado ao quadrado = ");
            result = Math.pow(i, 2);
            System.out.println(result);
        }

        sc.close();

    }
}
