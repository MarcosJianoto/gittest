package ListaDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static Usuario usuarioLogado = null;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        boolean rodando = true;
        while (rodando) {

            // Menu + input do usuário
            System.out.println("==== PAGINA INICIAL ====");
            System.out.println("[1] Fazer cadastro");
            System.out.println("[2] Fazer login");
            System.out.println("[3] Sair ");
            System.out.print("Digite a opção: ");
            String opcao = sc.nextLine();

            // processar o input do usuário
            switch (opcao) {
                case "1": {
                    System.out.println("==== FAZER CADASTRO ====");
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();
                    ArrayList<Tarefa> tarefas = new ArrayList<>();

                    Usuario u = new Usuario(email, senha, tarefas);

                    usuarios.add(u);
                    System.out.println("-----> Usuário cadastrado com sucesso");

                    break;
                }
                case "2": {
                    System.out.println("==== LOGIN ====");
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();

                    Boolean loginSucesso = false;
                    for (int i = 0; i < usuarios.size(); i++) {

                        String uEmail = usuarios.get(i).getEmail();
                        String uSenha = usuarios.get(i).getSenha();

                        if (uEmail.equals(email) && uSenha.equals(senha)) {
                            System.out.println("----> Login feito com sucesso!");
                            loginSucesso = true;
                            usuarioLogado = usuarios.get(i);
                            break;
                        }
                    }

                    if (!loginSucesso) {
                        System.out.println("----> Email/senha incorretos! ");
                    } else {
                        homePage();
                    }

                    break;
                }
                case "3": {
                    System.out.println("Encerrando programa... ");
                    rodando = false;
                    break;
                }
                default: {
                    break;
                }

            }

        }
        System.out.println("fim do programa");

        sc.close();

    }

    public static void homePage() {

        Boolean rodando = true;
        while (rodando) {
            System.out.println("==== HOMEPAGE ====");
            System.out.println("[1] Mostrar tarefas: ");
            System.out.println("[2] Mostrar tarefas finalizadas: ");
            System.out.println("[3] Mostrar tarefas não finalizadas: ");
            System.out.println("[4] Adicionar tarefa: ");
            System.out.println("[5] Finalizar tarefa: ");
            System.out.println("[6] Remover tarefa: ");
            System.out.println("[7] Logout: ");
            System.out.print("Digite a opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("==== TAREFAS ====");
                    ArrayList<Tarefa> lista = usuarioLogado.getTarefas();

                    if (lista.isEmpty()) {
                        System.out.println("[Lista de tarefas vazia!]");
                    }
                    for (int i = 0; i < lista.size(); i++) {

                        Tarefa t = lista.get(i);
                        System.out.println("Tarefa " + i);
                        System.out.println("\tTitulo: " + t.getTitulo());
                        System.out.println("\tFinalizada: " + t.isFinalizada());

                    }

                    break;
                }
                case "2": {
                    System.out.println("TAREFAS FINALIZADAS! ");

                    ArrayList<Tarefa> lista = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> finalizadas = new ArrayList<>();

                    for (Tarefa t : lista) {
                        if (t.isFinalizada()) {
                            finalizadas.add(t);
                        }
                    }

                    if (finalizadas.isEmpty()) {
                        System.out.println("[Não há tarefas finalizadas para mostrar]");
                    }

                    for (int i = 0; i < finalizadas.size(); i++) {
                        Tarefa t = finalizadas.get(i);
                        System.out.println("Tarefa: " + i);
                        System.out.println("\tTitulo: " + t.getTitulo());
                        System.out.println("\tFinalizada: " + t.isFinalizada());
                    }

                    break;
                }
                case "3": {
                    System.out.println("==== TAREFAS NÃO FINALIZADAS ====");
                    ArrayList<Tarefa> lista = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> naoFinalizadas = new ArrayList<>();

                    for (Tarefa t : lista) {
                        if (!t.isFinalizada()) {
                            naoFinalizadas.add(t);
                        }
                    }

                    if (naoFinalizadas.isEmpty()) {
                        System.out.println("[Não há tarefas em aberto!]");
                    }

                    for (int i = 0; i < naoFinalizadas.size(); i++) {
                        Tarefa t = naoFinalizadas.get(i);

                        System.out.println("Tarefa: " + i);
                        System.out.println("\tTitulo: " + t.getTitulo());
                        System.out.println("\tFinalizada: " + t.isFinalizada());
                    }

                    break;
                }
                case "4": {

                    System.out.println("==== NOVA TAREFA ====");
                    System.out.print("Digite o titulo: ");
                    String titulo = sc.nextLine();

                    Tarefa t = new Tarefa(titulo, false);

                    usuarioLogado.getTarefas().add(t);
                    System.out.println("----> Tarefa adicionada com sucesso! ");

                    break;
                }
                case "5": {
                    System.out.println("==== FINALIZAR TAREFA ====");
                    ArrayList<Tarefa> lista = usuarioLogado.getTarefas();
                    int temTarefas = 0;

                    for (int i = 0; i < lista.size(); i++) {
                        Tarefa t = lista.get(i);
                        if (!t.isFinalizada()) {
                            temTarefas++;
                            System.out.println("[" + i + "]" + t.getTitulo());
                        }
                    }

                    if (temTarefas == 0) {
                        System.out.println("[Nenhuma tarefa encontrada]");
                    } else {
                        System.out.print("Digite a tarefa que deseja finalizar: ");
                        int posicao = sc.nextInt();
                        sc.nextLine(); // limpar buffer

                        Tarefa tarefaFinalizada = lista.get(posicao);
                        tarefaFinalizada.setFinalizada(true);

                        System.out.println("Tarefa " + posicao + " finalizada com sucesso! ");
                    }

                    break;
                }
                case "6": {
                    System.out.println("==== REMOVER TAREFA ====");
                    ArrayList<Tarefa> lista = usuarioLogado.getTarefas();
                    if (lista.isEmpty()) {
                        System.out.println("[Sem tarefas para ser removidas!]");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("[" + i + "]" + lista.get(i).getTitulo());
                        }
                        System.out.println("Digite qual tarefa gostaria de remover: ");
                        int posicao = sc.nextInt();
                        sc.nextLine(); // limpar buffer

                        lista.remove(posicao);
                        System.out.println("-----> Tarefa " + posicao + " removida");
                    }

                    break;
                }
                case "7": {
                    System.out.println("----> Fazendo logout...");
                    rodando = false;
                    usuarioLogado = null;
                    break;
                }
            }

        }

    }

}
