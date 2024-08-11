package AppsSimples;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 5;
        long fatorial = calcularFatorial(numero);
        System.out.println(fatorial);

        sc.close();

    }

    private static long calcularFatorial(int numero) {

        if (numero <= 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }

    }

}
