import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App13 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Gerar um numero aleatório: ");
        int n = random.nextInt(100) + 1;
        System.out.println(n);
        System.out.println("Tente adivinhar, digite um numero: ");
        int numeroTentativa = sc.nextInt();
        int soma = 1;

        while (true) {
            if (numeroTentativa != n) {
                soma++;
                if (numeroTentativa < n) {
                    System.out.println("Seu numero é menor do que o numero a ser adivinhado.");
                } else {
                    System.out.println("Seu numero é maior do que o numero a ser adivinhado.");
                }
                if (soma == 10) {
                    System.out.println("Excedeu o limite, falhou");
                    break;
                }
                numeroTentativa = sc.nextInt();
                continue;
            }

            if (numeroTentativa == n) {
                System.out.println("Você descobriu, parabéns, após: " + soma + " tentativas");
                break;
            }

            sc.close();

        }

    }
}
