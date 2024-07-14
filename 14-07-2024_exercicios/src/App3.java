import java.util.Locale;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String string = "Marcos";
        String[] corte = string.split("");

        int somaA = 0;
        int somaM = 0;

        for (int i = 0; i < corte.length; i++) {
            if (corte[i].equals("a")) {
                somaA++;
            }
        }
        System.out.println(somaA);

        sc.close();

    }
}
