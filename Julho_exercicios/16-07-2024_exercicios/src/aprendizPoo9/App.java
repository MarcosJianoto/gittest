package aprendizPoo9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aprendizPoo9.entities.Livro;

public class App {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dts1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Quantos livros você irá inserir? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Livro> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            System.out.println("Qual o nome do " + (i + 1) + "º" + " Livro?");
            String name = sc.nextLine();

            System.out.println("Quem é o autor do livro? ");
            String autor = sc.nextLine();

            System.out.println("Qual o ano de lançamento do livro?");
            LocalDate date = LocalDate.parse(sc.nextLine(), dts1);

            System.out.println("Qual o gênero do livro? ");
            String genero = sc.nextLine();

            Livro livro = new Livro(name, autor, date, genero);
            list.add(livro);
        }

        System.out.println(list);

        sc.close();

    }
}
