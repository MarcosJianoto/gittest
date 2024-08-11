import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // simulação de URNa de votação simples..

        System.out.println("Quantos votos tiveram os candidatos?");
        int votos1 = random.nextInt(10000);
        int votos2 = random.nextInt(10000);
        int votos3 = random.nextInt(10000);

        System.out.println("Candidato 1 = " + votos1);
        System.out.println("Candidato 1 = " + votos2);
        System.out.println("Candidato 1 = " + votos3);

        sc.close();

    }
}
