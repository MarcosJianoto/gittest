import java.util.Random;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("insira 10 números inteiros: ");

        // inserir dentro da vect os inteiros
        Random random = new Random();
        int[] vect = new int[10];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = random.nextInt(100) + 1;
            System.out.println(vect[i]);
        }

        // ordenar os inteiros para pegar o menor e o maior

        System.out.print("Maior: ");
        int maior = 0;

        for (int i = 0; i < vect.length; i++) {
            if (maior < vect[i]) {
                maior = vect[i];
            }
        }
        System.out.println(maior);

        System.out.print("Menor: ");
        int menor = maior;
        for (int i = 0; i < vect.length; i++) {
            if (menor > vect[i]) {
                menor = vect[i];
            }
        }
        System.out.println(menor);

        sc.close();

    }
}
