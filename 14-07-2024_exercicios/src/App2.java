import java.util.Locale;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 8;
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println(soma);

        sc.close();

    }
}
