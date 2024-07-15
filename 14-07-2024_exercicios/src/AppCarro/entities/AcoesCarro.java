package AppCarro.entities;

public class AcoesCarro {

    private Carro carro;

    public AcoesCarro(Carro carro) {
        this.carro = carro;
    }

    public void acelerar(double value) {
        carro.velocidadeAtual += value;
    }

    public void frear() {
        System.out.println("O carrou freou");
        carro.velocidadeAtual = 0;
    }

    public String toString() {
        return carro.getMarca() + " " + carro.getVelocidadeAtual() + " " + carro.getCor() + " " + carro.getModelo();
    }

}
