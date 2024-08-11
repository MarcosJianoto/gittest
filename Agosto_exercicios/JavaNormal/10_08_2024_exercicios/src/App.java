import java.util.ArrayList;
import java.util.Scanner;

import entities.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {

        lista_tarefas();
    }

    public static void lista_tarefas() {
        Scanner sc = new Scanner(System.in);

        boolean rodando = true;
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        while (rodando) {

            System.out.println("O que você gostaria de fazer? ");
            System.out.println("[1] Inserir uma tarefa");
            System.out.println("[2] Apagar uma tarefa");
            System.out.println("[3] SAIR");
            System.out.print("Qual opção?");
            String opcao = sc.nextLine();

            try {

                switch (opcao) {
                    case "1": {
                        System.out.print("Nome da tarefa? ");
                        String name = sc.nextLine();

                        Tarefa t = new Tarefa(name, false);
                        tarefas.add(t);

                        System.out.println("----> Tarefa inserida com sucesso! ");

                        break;

                    }

                    case "2": {

                        if (tarefas.isEmpty()) {
                            System.out.println("Tarefas vazias");
                            System.out.println("[1] Adicionar tarefa ");
                            System.out.println("[2] SAIR");

                            System.out.print("Opção: ");
                            String opcaoTemp = sc.nextLine();
                            if (opcaoTemp.equals("1")) {
                                opcao = "1";
                                continue;
                            } else {
                                break;
                            }

                        } else {
                            System.out.println("Qual tarefa irá apagar? ");

                            for (int i = 0; i < tarefas.size(); i++) {
                                Tarefa t = tarefas.get(i);

                                System.out.println("[ " + i + " ]" + t.getName());

                            }

                            int tarefaApagar = sc.nextInt();
                            sc.nextLine();

                            for (int i = 0; i < tarefas.size(); i++) {
                                tarefas.remove(tarefaApagar);
                                System.out.println("----> Tarefa excluída com sucesso! ");
                            }

                        }

                        break;

                    }

                    case "3": {
                        rodando = false;
                        break;

                    }

                }

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }
}
