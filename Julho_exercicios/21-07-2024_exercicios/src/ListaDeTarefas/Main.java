package ListaDeTarefas;

public class Main {

    public static void main(String[] args) {
        // uma exceção é um ERRO! Exception é a classe que representa as exceções.

        int a, b, divisao;
        a = 0;
        b = 10;

        try {
            divisao = 10 / 0;
        } catch (Exception e) {
            System.out.print("e.printStackTrace(): ");
            e.printStackTrace();

            System.out.println("Deu erro: " + e.getMessage());
        }

        System.out.println("Finalizando programa!!");

    }

}
