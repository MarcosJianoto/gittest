import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App12 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("numero secreto: ");
        int n = random.nextInt(10) + 1;
        System.out.println(n);
        Boolean verdade = true;

        while (verdade) {

            int nDigitado = sc.nextInt();
            if (nDigitado == n) {
                System.out.println("Descobriu, o numero era: " + n);
            } else {
                nDigitado = sc.nextInt();
            }
            verdade = false;
        }

        sc.close();

    }
}
