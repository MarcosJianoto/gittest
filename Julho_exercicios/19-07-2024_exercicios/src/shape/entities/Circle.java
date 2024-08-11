package shape.entities;

public class Circle extends Shape {

    private double PI;
    private double raio;

    public Circle(Color color, double PI, double raio) {
        super(color);
        this.PI = PI;
        this.raio = raio;
    }

    public double getPI() {
        return this.PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * Math.pow(raio, 2);
    }

}
