import java.util.ArrayList;
import java.util.Scanner;

import entities.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        tarefas();

    }

    public static void tarefas() {

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("O que gostaria de fazer? ");
            System.out.println("[1] Criar nova tarefa");
            System.out.println("[2] Visualizar tarefas existentes");
            System.out.println("[3] SAIR");
            String opcao = sc.nextLine();

            switch (opcao) { 
                case "1": {
                    try {

                        System.out.println("Qual tarefa gostaria de adicionar?");
                        String name = sc.nextLine();
                        boolean finalizada = true;

                        Tarefa t = new Tarefa(name, finalizada);

                        tarefas.add(t);

                        System.out.println("---> Tarefa adicionada com sucesso! ");

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                    break;
                }
                case "2": {

                }
                case "3": {

                    try {
                        System.out.println("=== SAIR DO PROGRAMA ===");
                        rodando = false;
                        break;

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }

    }

}
