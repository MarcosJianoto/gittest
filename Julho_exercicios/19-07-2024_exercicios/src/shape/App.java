package shape;

import java.util.Scanner;

import shape.entities.Circle;
import shape.entities.Color;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Regtangle or Circle? (r/c)");
            String typeShape = sc.nextLine();
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();

            if (typeShape.equals("r")) {
                double PI = 3.14;
                double raio = sc.nextDouble();
                Circle circle = new Circle(Color.BLACK, PI, raio);
            } else {
                System.out.print("width: ");
                double base = sc.nextDouble();
                System.out.print("height: ");
                double altura = sc.nextDouble();
            }

        }

        sc.close();

    }
}
