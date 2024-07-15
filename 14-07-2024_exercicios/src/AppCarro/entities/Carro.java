package AppCarro.entities;

public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    protected int velocidadeAtual;

    public Carro(String marca, String modelo, String cor, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

}
