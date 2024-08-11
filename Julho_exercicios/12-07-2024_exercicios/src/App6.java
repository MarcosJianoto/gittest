import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Remoção de espaços: ");
        String n = "Marcos Aurelio";
        String[] nSplit = n.split(" ");

        String m = "";

        for (int i = 0; i < nSplit.length; i++) {
            m += nSplit[i];
        }

        System.out.println(m);

        sc.close();

    }
}
