import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App15 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numero = 4;
        long fatorial = 1;

        System.out.println("Calculo de fatorial: ");
        for (int i = 1; i <= numero; i++) {
            // 1ª -- 1 * 2; --- 2ª -- 2 * 3 --- 3ª 6 * 4 --- 20 * 5;
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();

    }
}
