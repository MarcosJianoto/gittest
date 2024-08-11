package figura.entities;

public class Circulo extends FiguraGeometrica {

    public double PI;
    public double raio;

    public Circulo() {
    }

    public Circulo(double PI, double raio) {
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
        PI = 3.14;
        return PI * (raio * raio);
    }

    @Override
    public String toString() {
        return "{" +
                " PI='" + getPI() + "'" +
                ", raio='" + getRaio() + "'" +
                "}";
    }

}
