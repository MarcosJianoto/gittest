import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // conversor de moedas...
        System.out.println("Qual moeda gostaria de converter nas outras? ");
        System.out.println("Dolar/Real/Euro/Libra Esterlina | d/r/e/le/");
        String moedaEscolhida = sc.nextLine();
        double value = 0;

        if (moedaEscolhida.equals("r")) {
            System.out.println("Quantos Reais? ");
            value = sc.nextDouble();
            System.out.println(value + " Reais em Dólares = " + value * 0.18);
            System.out.println(value + " Reais em Euro = " + value * 0.17);
            System.out.println(value + " Reais em Libras Esterlinas  = " + value * 0.14);

        } else if (moedaEscolhida.equals("d")) {
            System.out.println("Quantos Dólares?");
            value = sc.nextDouble();
            System.out.println(value + " Dólares em Reais = " + value * 5.45);
            System.out.println(value + " Dólares em Euro = " + value * 1.09);
            System.out.println(value + " Dólares em Libras Esterlinas  = " + value * 0.77);

        } else if (moedaEscolhida.equals("e")) {
            System.out.println("Quantos Euros? ");
            value = sc.nextDouble();
            System.out.println(value + " Euros em Reais = " + value * 5.94);
            System.out.println(value + " Euros em Dólares = " + value * 1.09);
            System.out.println(value + " Euros em Libras Esterlinas  = " + value * 0.84);

        } else if (moedaEscolhida.equals("le")) {
            System.out.println("Quantas Libras Esterlinas? ");
            value = sc.nextDouble();
            System.out.println(value + " Libras Esterlinas em Reais = " + value * 7.07);
            System.out.println(value + " Libras Esterlinas em Dólares = " + value * 1.30);
            System.out.println(value + " Libras Esterlinas em Euros = " + value * 1.19);

        }

        sc.close();

    }
}
