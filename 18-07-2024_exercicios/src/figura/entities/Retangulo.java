package figura.entities;

public class Retangulo extends FiguraGeometrica {

    public Retangulo() {
    }

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        if (base != altura) {
            return base * altura;
        } else {
            throw new IllegalArgumentException("Base e altura são iguais");
        }
    }

    @Override
    public double perimetro() {
        if (base != altura) {
            return 2 * (base + altura);
        } else {
            throw new IllegalArgumentException("Base e altura são iguais");
        }
    }

}
