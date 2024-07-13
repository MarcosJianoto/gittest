import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n = random.nextInt(10) + 1;
        System.out.println(n);
        System.out.println("----------------------");

        int numeroDigitado = sc.nextInt();

        while (n != numeroDigitado) {

            System.out.println("------" + n);
            numeroDigitado = sc.nextInt();

        }

        sc.close();

    }
}
