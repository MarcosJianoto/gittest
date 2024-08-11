import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App9 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite duas notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        System.out.println("Média aritmética: ");
        System.out.println((nota1 + nota2) / 2);
        System.out.println("--------------------------------------------------");

        System.out.println("Media ponderada com aleatóriedade: ");
        int pesoNota1 = random.nextInt(5) + 1;
        System.out.println(pesoNota1);
        int pesoNota2 = random.nextInt(5) + 1;
        System.out.println(pesoNota2);
        double mediaPonderada = ((pesoNota1 * nota1) + (pesoNota2 * nota2)) / (pesoNota1 + pesoNota2);

        System.out.println(mediaPonderada);

        sc.close();

    }
}
