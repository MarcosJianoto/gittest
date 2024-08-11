import java.util.Random;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] vect = new int[10];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = random.nextInt(10) + 1;
            System.out.println(vect[i]);
        }

        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect.length; j++) {
                if (vect[j] > vect[j] + 1) {
                    int temp = vect[j];
                    vect[j] = vect[j] + 1;
                    vect[j + 1] = temp;
                }
            }

        }

        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.println("elemento: " + i + ": " + vect[i]);
        }

        sc.close();

    }

}