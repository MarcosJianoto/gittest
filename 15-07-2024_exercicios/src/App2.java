import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Qual o seu objeto? Quadrado/ Retangulo / Triangulo / Circulo --- qrtc");
        String tipoForma = sc.nextLine();

        double v1 = 0;
        double v2 = 0;
        double v3 = 0;

        if (tipoForma.equals("q") || tipoForma.equals("r") || tipoForma.equals("t")) {
            v1 = random.nextInt(100);
            System.out.println(v1);
            v2 = random.nextInt(100);
            System.out.println(v2);

            if (tipoForma.equals("t")) {
                System.out.print("Area do triangulo: ");
                System.out.println(v1 * v2 / 2);
            } else if (tipoForma.equals("q")) {
                System.out.print("Area do quadrado: ");
                System.out.println(v1 * v2);
            } else {
                System.out.println("Area do retangulo: ");
                System.out.println(v1 * v2);
            }

        } else if (tipoForma.equals("c")) {
            System.out.println("Digite o raio de seu circulo: ");
            v1 = random.nextInt(100);
            System.out.print("Area do circulo: ");
            System.out.println(3.14 * Math.pow(v1, 2));
        }

        sc.close();

    }
}
