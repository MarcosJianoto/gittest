import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero, vamos ver quais numeros são primos até ele: ");

        int ateNonesimo = sc.nextInt();
        int soma = 0;

        for (int i = 2; i <= ateNonesimo; i++) {
            soma++;

            if (i == 2 || i == 3 || i == 5) {
                System.out.printf(i + " ");
            } else {
                if (soma % 10 == 0) {
                    System.out.println();
                }

                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                    System.out.printf(i + " ");
                }
            }

        }

        sc.close();

    }
}
