package aprendizPoo5.entities;

public class Produto {

    private String name;
    private Double price;
    private Integer quantity;

    public Produto() {
    }

    public Produto(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void adicionar(int quantity) {
        this.quantity += quantity;
    }

    public void remover(int quantity) {
        this.quantity -= quantity;
    }

    public void attPrice(double price) {
        this.price = price;
    }

    public void quantity() {
        System.out.println("Quantity: " + quantity);
    }

}
