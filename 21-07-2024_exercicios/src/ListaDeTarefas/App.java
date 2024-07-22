package ListaDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // utilizando arraylist ele sempre adiicona no final, nao sendo necessário
        // especificar.
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        boolean rodando = true;

        while (rodando) {
            System.out.println("[1] Cadastrar usuário ");
            System.out.println("[2] Listar todos os usuários cadastrados ");
            System.out.println("[3] Procurar usuário por email ");
            System.out.println("[4] Atualizar dados de um usuário ");
            System.out.println("[5] Remover usuário ");
            System.out.println("[6] Sair ");
            System.out.print("Digite a opção desejada: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("====== CADASTRO DE USUÁRIO ======");
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();
                    usuarios.add(new Usuario(email, senha));
                    break;
                }
                case "2": {
                    System.out.println("====== USUÁRIOS CADASTRADOS ======");
                    for (Usuario u : usuarios) {
                        System.out.println(u);
                    }
                    break;
                }
                case "3": {
                    System.out.println("====== PROCURAR USUÁRIO POR E-MAIL ======");
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();
                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario uTemp = usuarios.get(i);
                        if (uTemp.getEmail().equals(email)) {
                            System.out.println("usuario encontrado: " + uTemp.getEmail());
                            System.out.println("usuario encontrado: " + uTemp.getSenha());
                            break;
                        }

                    }
                    break;
                }
                case "4": {
                    break;
                }
                case "5": {
                    break;
                }
                case "6": {
                    rodando = false;
                    break;
                }
            }

        }

    }

}
