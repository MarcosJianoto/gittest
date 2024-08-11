package AppsSimples;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App9 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros gostaria de calcular? ");
        int n = 5;

        int[] calc = new int[n];
        for (int i = 0; i < n; i++) {
            calc[i] = sc.nextInt();
        }

        sc.close();
    }

}
