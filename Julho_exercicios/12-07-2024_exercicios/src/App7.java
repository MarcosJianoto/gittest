import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String n = "Marcos Aurelio gafsa fsafsaf sa sa safsa f safsaf asfsa fsa fsaf safs afsafsa fsa";
        String[] nVect = n.split(" ");
        int soma = 0;

        for (int i = 0; i < nVect.length; i++) {
            soma++;
        }

        System.out.println(soma);

        sc.close();

    }
}
