import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 5. Crie um programa que verifique se um ano é bissexto ou não. Utilize
        // variáveis para armazenar o ano e a regra de ano bissexto para verificar a
        // condição.
        int ano = 100;
        System.out.print(ano);

        for (int i = 0; i <= ano; i++) {

            if (i % 4 == 0) {
                if (i % 100 != 0) {
                    System.out.println(i + " Bissexto");
                } else if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        System.out.println(i + " Bissexto");
                    } else {
                        System.out.println(i + " Não");
                    }
                }
            } else {
                System.out.println(i + " Não");
            }

        }
        sc.close();

    }
}
