package listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

import dao.TarefaDAO;
import dao.UsuarioDAO;
import model.Tarefa;
import model.Usuario;

public class ListaTarefas {

    public static Scanner sc = new Scanner(System.in);
    public static Usuario usuarioLogado = null;

    public static void main(String[] args) throws Exception {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        boolean rodando = true;
        while (rodando) {
            System.out.println("==== PAGINA INICIAL ====");
            System.out.println("[1] Fazer Cadastro");
            System.out.println("[2] Fazer Login");
            System.out.println("[3] Logout");
            System.out.print("Digite a opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("==== FAZER CADASTRO ====");
                    System.out.print("Qual seu email? ");
                    String email = sc.nextLine();
                    System.out.print("Qual sua senha? ");
                    String senha = sc.nextLine();

                    ArrayList<Tarefa> tarefas = new ArrayList<>();

                    Usuario u = new Usuario(email, senha, tarefas);

                    boolean success = UsuarioDAO.createUsers(u);

                    if (success = true) {
                        System.out.println("---> Usuario cadastrado com sucesso!");
                    } else {
                        System.out.println("---> ERRO: Usuario não cadastrado");
                    }

                    break;
                }

                case "2": {
                    System.out.println("==== FAZER LOGIN ====");
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();

                    Usuario u = UsuarioDAO.buscarUsuarioPorEmail(email);

                    Boolean loginSuccess = false;

                    if (u != null && u.getSenha().equals(senha)) {
                        loginSuccess = true;
                    }

                    if (!loginSuccess) {
                        System.out.println("---> Email/Senha incorretos! ");
                    } else {
                        usuarioLogado = u;
                        listaTarefas();
                    }

                    break;

                }

                case "3": {
                    System.out.println("----> Encerrando programa...");
                    rodando = false;
                    break;
                }

                default: {
                    System.out.println("Não existe essa opção, digite outra! ");
                    System.out.println();
                    break;
                }

            }

        }
        sc.close();

    }

    public static void listaTarefas() {

        ArrayList<Tarefa> tarefas = new ArrayList<>();

        System.out.println();
        System.out.println("==== LISTA DE TAREFAS ====");
        boolean rodando = true;

        while (rodando) {
            System.out.println("[1] Adicionar tarefa");
            System.out.println("[2] Apagar tarefa");
            System.out.println("[3] Marcar tarefa como concluída");
            System.out.println("[4] Marcar tarefa como não concluída");
            System.out.println("[5] Ver tarefas pendentes");
            System.out.println("[6] Ver tarefas concluídas");
            System.out.println("[7] Editar tarefa");
            System.out.println("[8] Visualizar todas as tarefas ");
            System.out.print("Digite a opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("==== Adicionar tarefa ====");
                    System.out.print("Qual o titulo da tarefa? ");
                    String titulo = sc.nextLine();

                    Tarefa t = new Tarefa(titulo, false);
                    usuarioLogado.getTarefas().add(t);

                    System.out.println("----> Tarefa inserida com sucesso! ");

                    break;

                }

                case "2": {
                    System.out.println("==== Apagar tarefa =====");
                    ArrayList<Tarefa> lista = usuarioLogado.getTarefas();

                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia! ");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("[ " + i + " ] - " + lista.get(i).getTitulo());
                        }
                        System.out.print("Digite qual tarefa gostaria de remover: ");
                        int posicao = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Tem certeza que gostaria de remover essa tarefa? s/n");
                        String removerTarefa = sc.nextLine();
                        if (removerTarefa.equals("s")) {
                            lista.remove(posicao);
                            System.out.println("----> Tarefa removida com sucesso! ");
                            System.out.println();
                        } else {
                            break;
                        }
                    }
                    break;

                }
                case "3": {
                    System.out.println("==== Marcar tarefa como concluída ====");
                    ArrayList<Tarefa> lista = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> naoFinalizada = new ArrayList<>();

                    if (lista.isEmpty()) {
                        System.out.println("[lista está vazia! ]");
                        System.out.println();
                    } else {

                        for (int i = 0; i < lista.size(); i++) {
                            if (!lista.get(i).isFinalizada()) {
                                naoFinalizada.add(lista.get(i));
                            }
                        }

                        System.out.println("Tarefas não concluídas: ");
                        for (int i = 0; i < naoFinalizada.size(); i++) {
                            System.out.println("\t[ " + i + " ] - " + naoFinalizada.get(i).getTitulo());
                        }

                        if (naoFinalizada.isEmpty()) {
                            System.out.println("[Sem tarefa para concluir]");
                        } else {

                            System.out.print("Qual tarefa gostaria de finalizar? ");
                            int tarefaFinalizar = sc.nextInt();

                            if (naoFinalizada.equals(naoFinalizada)) {
                                naoFinalizada.get(tarefaFinalizar).setFinalizada(true);
                                System.out.println("---->Tarefa finalizada com sucesso! ");
                                System.out.println();
                            }

                        }

                    }

                    break;

                }
                case "4": {
                    System.out.println("Marcar tarefa como não concluida: ");
                    ArrayList<Tarefa> list = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> finalizadas = new ArrayList<>();

                    if (list.isEmpty()) {
                        System.out.println("----> Lista está vazia!");
                    } else {
                        for (Tarefa t : list) {
                            if (t.isFinalizada()) {
                                finalizadas.add(t);
                            }
                        }

                        if (finalizadas.isEmpty()) {
                            System.out.println("[Não temos tarefas finalizadas]");
                        } else {
                            for (int i = 0; i < finalizadas.size(); i++) {
                                System.out.println(finalizadas.get(i));
                            }

                            System.out.println("Qual tarefa não concluiu? ");
                            int tarefaParaFinalizar = sc.nextInt();
                            sc.nextLine();

                            for (int i = 0; i < finalizadas.size(); i++) {
                                if (finalizadas.get(i).equals(tarefaParaFinalizar)) {
                                    finalizadas.get(i).setFinalizada(false);
                                    System.out.println("Tarefa: " + i + "voltou a ficar pendente");
                                }
                            }
                        }
                    }

                    break;
                }

                case "5": {
                    System.out.println("Ver tarefas pendentes: ");
                    ArrayList<Tarefa> list = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> pendentes = new ArrayList<>();

                    if (list.isEmpty()) {
                        System.out.println("Lista está vazia! Adicione novas tarefas!  ");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            Tarefa t = list.get(i);
                            if (!t.isFinalizada()) {
                                pendentes.add(t);
                            }
                        }

                        for (int i = 0; i < pendentes.size(); i++) {

                            System.out.println("\t[ " + i + " ] - " + pendentes.get(i).getTitulo());
                        }
                    }
                    break;
                }

                case "6": {
                    System.out.println("[Ver tarefas concluídas]");
                    ArrayList<Tarefa> list = usuarioLogado.getTarefas();
                    ArrayList<Tarefa> concluidas = new ArrayList<>();

                    if (list.isEmpty()) {
                        System.out.println("Lista está vazia! ");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).isFinalizada()) {
                                concluidas.add(list.get(i));
                            }
                        }
                        for (int i = 0; i < concluidas.size(); i++) {
                            System.out.println(concluidas.get(i));
                        }
                    }

                    if (concluidas.size() == 0) {
                        System.out.println("---> Nenhuma tarefa concluída");
                        System.out.println();
                    }
                    break;

                }

                case "7": {
                    System.out.println("[Editar tarefa: ]");
                    ArrayList<Tarefa> list = usuarioLogado.getTarefas();

                    if (list.isEmpty()) {
                        System.out.println("---> Lista de tarefas está vazia");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println("\t" + "[" + i + "]" + list.get(i));
                        }
                        System.out.print("Qual tarefa gostaria de editar? ");
                        int n = sc.nextInt();
                        sc.nextLine();
                        if (n > (list.size() - 1)) {
                            System.out.println("Não existe essa tarefa, digite novamente: ");
                            n = sc.nextInt();
                        } else {
                            Tarefa tarefaEditar = list.get(n);

                            System.out.println("O que gostaria de fazer com a tarefa? ");
                            System.out.println("[ 1 ] - Editar o Nome");
                            System.out.println("[ 2 ] - Editar o Status");
                            System.out.print("Digite a opção:  ");
                            String opcaoEditar = sc.nextLine();

                            switch (opcaoEditar) {
                                case "1": {
                                    System.out.print("Digite qual titulo gostaria: ");
                                    tarefaEditar.setTitulo(sc.nextLine());
                                    System.out.println("----> Titulo alterado");
                                    System.out.println();
                                    break;
                                }
                                case "2": {
                                    if (tarefaEditar.isFinalizada()) {
                                        tarefaEditar.setFinalizada(false);
                                    } else {
                                        tarefaEditar.setFinalizada(true);
                                    }
                                    System.out.println("----> Status alterado");
                                    System.out.println();
                                    break;
                                }

                            }
                        }

                    }
                    break;

                }
                case "8": {
                    System.out.println("=== TODAS AS TAREFAS ===");
                    ArrayList<Tarefa> list = TarefaDAO.buscarTarefasDoUsuario(usuarioLogado);

                    if (list.isEmpty()) {
                        System.out.println("----> Lista de tarefas está vazia");
                        break;
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print("\tTitulo: " + list.get(i).getTitulo() + " | ");
                            System.out.println("Status: " + list.get(i).getFinalizada());
                            System.out.println();
                            break;
                        }
                    }

                }
                default: {
                    System.out.println("Não existe essa opção, digite outra!");
                    System.out.println();
                    break;
                }

            }

        }

    }

}