package figura.entities;

public class FiguraGeometrica {

    protected double base;
    protected double altura;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "{" +
                " base='" + getBase() + "'" +
                ", altura='" + getAltura() + "'" +
                "}";
    }

}
