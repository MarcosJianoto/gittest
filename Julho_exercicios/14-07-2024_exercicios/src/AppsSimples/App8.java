package AppsSimples;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App8 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = "Marcos";

        System.out.println("Olá, " + name);

        sc.close();
    }

}
