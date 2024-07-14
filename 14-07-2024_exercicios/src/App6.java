import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String textInput = sc.nextLine().toLowerCase();

        int contagemVogais = 0;
        int contagemConsoantes = 0;

        for (int i = 0; i < textInput.length(); i++) {
            char c = textInput.charAt(i);

            if (isVogal(c)) {
                contagemVogais++;
            } else {
                contagemConsoantes++;
            }

        }

        System.out.println(contagemConsoantes);
        System.out.println(contagemVogais);

        sc.close();

    }

    public static boolean isVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
