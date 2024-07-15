package AppCarro;

import java.util.Locale;
import java.util.Scanner;

import AppCarro.entities.AcoesCarro;
import AppCarro.entities.Carro;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AcoesCarro car = new AcoesCarro(new Carro("car", "Vectra", "azul", 50));
        car.acelerar(10);

        System.out.println(car.toString());

        sc.close();

    }
}
