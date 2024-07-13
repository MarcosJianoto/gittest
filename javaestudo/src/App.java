import controller.BancoDeDados;
import model.Item;

public class App {
    public static void main(String[] args) throws Exception {

        Item dipirona = new Item("Dipirona 500mg", 100, "Caixa");
        Item bromoprida = new Item("Bromoprida 200mg", 100, "Caixa");

        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.cadastrar(dipirona);

        bancoDeDados.cadastrar(bromoprida);

    }
}
