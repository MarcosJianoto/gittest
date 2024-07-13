import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int soma = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println(soma);

        sc.close();

    }
}
