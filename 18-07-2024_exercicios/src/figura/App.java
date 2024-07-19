package figura;

import figura.entities.Circulo;
import figura.entities.FiguraGeometrica;
import figura.entities.Quadrado;
import figura.entities.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {

        double PI = 3.14;
        double raio = 20;

        Circulo circulo = new Circulo(PI, raio);
        System.out.println(circulo);
        circulo.area();
        System.out.println(circulo.area());

        System.out.println("Retangulo");
        double base = 10;
        double altura = 15;

        Retangulo retangulo = new Retangulo(base, altura);

        System.out.println("FACTORY");
        FiguraGeometrica object1 = criarForma(base, altura);
        object1.area();
        System.out.println(object1.area());

    }

    public static FiguraGeometrica criarForma(double base, double altura) {
        if (base == altura) {
            return new Quadrado(base, altura);
        } else {
            return new Retangulo(base, altura);
        }
    }

}
