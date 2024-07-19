package figura.entities;

public class Quadrado extends FiguraGeometrica {

    public Quadrado() {
    }

    public Quadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        if (base == altura) {
            return base * altura;
        } else {
            throw new IllegalArgumentException("Base e altura nao sao iguais");
        }
    }

    @Override
    public double perimetro() {
        if (base == altura) {
            return 2 * (base + altura);
        } else {
            throw new IllegalArgumentException("Base e altura nao sao iguais");
        }
    }

}
