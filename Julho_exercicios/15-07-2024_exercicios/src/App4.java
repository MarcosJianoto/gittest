import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Simulação de jogo de dados de 6 lados: ");
        System.out.println("Quantos dados voce quer jogar? ");

        int dados = random.nextInt(10000);
        int somaDados = 0;
        for (int i = 0; i < dados; i++) {
            int valueDado = random.nextInt(6) + 1;
            somaDados += valueDado;
            System.out.println("Dado " + (i + 1) + " é =  " + valueDado);
        }
        System.out.println(somaDados);

        sc.close();

    }
}
