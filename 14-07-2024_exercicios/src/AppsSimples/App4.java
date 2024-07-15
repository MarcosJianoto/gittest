package AppsSimples;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros: ");
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] arrayNew = new int[array.length];
        System.out.println("Inverter array");

        for (int i = array.length - 1; i > 0; i--) {

            arrayNew[i] = array[array.length - 1 - i];

        }

        for (int i = 0; i < arrayNew.length; i++) {
            System.out.println(arrayNew[i]);
        }

        sc.close();

    }
}
