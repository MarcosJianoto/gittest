package shape.entities;

public class Regtangle extends Shape {

    private double base;
    private double altura;

    public Regtangle(Color color) {
        super(color);
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

    @Override
    public double area() {
        return base * altura;
    }

}
