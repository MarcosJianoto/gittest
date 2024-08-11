package aprendizPoo7;

import java.time.LocalDate;

import aprendizPoo7.entities.Veiculo;

public class App {

    public static void main(String[] args) throws Exception {

        LocalDate anoFabricacao = LocalDate.of(2015, 10, 25);
        Boolean carroLigou = false;

        Veiculo veiculo = new Veiculo("Volkswagen", "Gol G5", anoFabricacao, 43531515, carroLigou, 0.0);
        System.out.println(veiculo);

        veiculo.acelerar(100.00);
        veiculo.parar();

        veiculo.ligar();
        veiculo.acelerar(50.00);
        veiculo.parar();

    }
}
