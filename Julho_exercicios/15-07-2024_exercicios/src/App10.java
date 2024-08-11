import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        sc.close();

    }
}
