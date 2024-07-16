import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App14 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Calculo de área e perimetro de um circulo: ");
        double raio = random.nextDouble(10) + 1;
        System.out.println(raio);

        double calcArea = 3.14 * Math.pow(raio, 2);
        double perimetro = 2 * 3.14 * raio;
        System.out.println("Area: " + calcArea);
        System.out.println("Perímetro:  " + perimetro);

        sc.close();

    }
}
