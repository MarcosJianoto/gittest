import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] vectOrder = new int[5];
        for (int i = 0; i < vectOrder.length; i++) {
            vectOrder[i] = random.nextInt(100);
            System.out.println(vectOrder[i]);
        }

        Arrays.sort(vectOrder);

        System.out.println("ordenado");
        for (int i = 0; i < vectOrder.length; i++) {
            System.out.println(vectOrder[i]);

        }

        sc.close();

    }
}
