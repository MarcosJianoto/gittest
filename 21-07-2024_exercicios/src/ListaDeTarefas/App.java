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

                    Usuario u = new Usuario(email, senha);
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

                    break;
                }
                case "2": {
                    break;
                }
                case "3": {
                    break;
                }
                case "4": {
                    break;
                }
                case "5": {
                    break;
                }
                case "6": {
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
