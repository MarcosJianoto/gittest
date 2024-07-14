import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = sc.nextLine().toLowerCase();

        int contagemVogais = 0;
        int contagemConsoantes = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                if (isVogal(c)) {
                    contagemVogais++;
                } else {
                    contagemConsoantes++;
                }

            }

            // verificar se é uma letra

        }
        System.out.println(contagemConsoantes);
        System.out.println(contagemVogais);

        sc.close();

    }

    public static boolean isVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
