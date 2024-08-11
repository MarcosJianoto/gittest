import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("gerenciador de lista de tarefas pendentes..");

        String tarefa1 = sc.nextLine();
        String tarefa2 = sc.nextLine();

        sc.close();

    }
}
