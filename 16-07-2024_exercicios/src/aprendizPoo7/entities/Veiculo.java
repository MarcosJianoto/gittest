package aprendizPoo7.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Veiculo {

    private String marca;
    private String modelo;
    private LocalDate anoFabricacao;
    private float placa;

    private Boolean carroLigou = false;
    private Double acelerar = 0.0;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, LocalDate anoFabricacao, float placa, Boolean carroLigou,
            double acelerar) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.carroLigou = false;
        this.acelerar = acelerar;
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

    public LocalDate getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public float getPlaca() {
        return this.placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    public Boolean getCarroLigou() {
        return this.carroLigou;
    }

    public void setLigou(Boolean carroLigou) {
        this.carroLigou = carroLigou;
    }

    public Double getAcelerar() {
        return this.acelerar;
    }

    public void setAcelerar(double acelerar) {
        this.acelerar = acelerar;
    }

    public void ligar() {
        carroLigou = true;
        System.out.println("Carro ligou!");
    }

    public void acelerar(double valueAcelerar) {
        if (carroLigou == true) {
            acelerar += valueAcelerar;
            System.out.println("Começou a acelerar! Está na velocidade:  " + acelerar);
        } else {
            System.out.println("Carro não pode acelerar pois está desligado! ");
        }
    }

    public void parar() {
        if (carroLigou == true && acelerar != 0) {
            System.out.println("O carro parou!");
        } else {
            System.out.println("O carro já está parado!");
        }
    }

    @Override
    public String toString() {
        return "{" +
                " marca='" + getMarca() + "'" +
                ", modelo='" + getModelo() + "'" +
                ", anoFabricacao='" + getAnoFabricacao() + "'" +
                ", placa='" + getPlaca() + "'" +
                ", carroLigou='" + getCarroLigou() + "'" +
                ", acelerar='" + getAcelerar() + "'" +
                "}";
    }

}
