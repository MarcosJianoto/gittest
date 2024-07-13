import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[10];
        Random random = new Random();

        for (int i = 0; i < vect.length; i++) {
            vect[i] = random.nextInt(10) + 1;
        }

        Arrays.sort(vect);

        System.out.println("Array ordenado: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Elemento" + i + ": " + vect[i]);
        }

        sc.close();

    }

}