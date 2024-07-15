import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // variáveis, tipos de dados e estruturas de controle... ok, parece legal..
        String name = "Marcos";
        int idade = 10;
        System.out.println("Bom dia " + name + " você tem " + idade + " anos de idade");

        System.out.println("--------------------------------------------");

        System.out.println("Digite dois numeros: ");

        int n1 = random.nextInt(100);
        int n2 = random.nextInt(100);

        System.out.println("Soma: = " + (n1 + n2));
        System.out.println("Diferença: = " + (n1 - n2));
        System.out.println("Multiplicação: = " + (n1 * n2));
        System.out.println("Divisão: = " + (n1 / n2));

        System.out.println("--------------------------------------------");

        System.out.println("Conversor de Celcius para Farenheit: ");
        double celcius = random.nextInt(100);
        double celciusEmFarenheit = (celcius * 1.8) + 32;
        System.out.println("Celcius = " + celcius);
        System.out.println("Celcius em Farenheit = " + celciusEmFarenheit);

        System.out.println("Conversor de Farenheit para Celcius");
        double farenheit = random.nextInt(100);
        double farenheitEmCelcius = (farenheit - 32) / (1.8);
        System.out.println("Farenheit = " + farenheit);
        System.out.println("Farenheit em Celcius = " + farenheitEmCelcius);

        System.out.println("--------------------------------------------");
        System.out.println("Calcular area de quadrado/retangulo/triangulo ou circulo: ");
        


        sc.close();

    }
}
