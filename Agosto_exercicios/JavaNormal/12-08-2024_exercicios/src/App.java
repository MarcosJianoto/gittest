import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class App {

    public static ArrayList<Produtos> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        produtos();
    }

    public static void produtos() {
        boolean rodando = true;

        while (rodando) {
            try {
                System.out.println("O que gostaria de fazer?");
                System.out.println("[1] Adicionar produto");
                System.out.println("[2] Atualizar produto");
                System.out.println("[3] Listar todos os produtos");
                System.out.println("[4] Remover produto");
                System.out.println("[5] SAIR");
                System.out.print("Escolha sua opção: ");
                String opcao = sc.nextLine();

                switch (opcao) {
                    case "1": {
                        System.out.println("===== ADICIONAR PRODUTO =====");
                        System.out.print("Código do produto: ");
                        Long id = 10L;// sc.nextLong();
                        // sc.nextLine();
                        System.out.print("Nome do produto: ");
                        String name = "Marcos";// sc.nextLine();
                        System.out.print("Preço do produto: ");
                        Double price = 50.00;// sc.nextDouble();
                        System.out.print("Quantidade do produto: ");
                        Integer quantity = 10;// sc.nextInt();
                        // sc.nextLine();

                        Produtos produtos = new Produtos(id, name, price, quantity);
                        list.add(produtos);
                        System.out.println("---> Produto adicionado com sucesso! ");
                        System.out.println();

                        break;
                    }
                    case "2": {
                        System.out.println("==== ATUALIZAR PRODUTO ==== ");

                        if (list.isEmpty()) {
                            System.out.println("---> Lista de produtos vazia!");
                            System.out.println();
                        } else {
                            System.out.println("O que você gostaria de atualizar no produto? ");
                            System.out.println("[1] - ID]");
                            System.out.println("[2] - Name] ");
                            System.out.println("[3] - Price]");
                            System.out.println("[4]- Quantity]");
                            System.out.print("Escolha sua opção: ");
                            String opcaoAtualizarProduto = sc.nextLine();

                            switch (opcaoAtualizarProduto) {
                                case "1": {
                                    buscarProdutos();

                                    System.out.println();
                                    System.out.print("Qual produto gostaria de alterar?");
                                    int qualProdutoAlterar = sc.nextInt();
                                    sc.nextLine();

                                    alterarProduto(qualProdutoAlterar);

                                    break;
                                }
                                case "2": {
                                    buscarProdutos();

                                    System.out.println();
                                    System.out.print("Qual produto gostaria de alterar?");
                                    int qualProdutoAlterar = sc.nextInt();
                                    sc.nextLine();

                                    alterarProduto(qualProdutoAlterar);

                                }
                                case "3": {
                                    buscarProdutos();

                                    System.out.println();
                                    System.out.print("Qual produto gostaria de alterar?");
                                    int qualProdutoAlterar = sc.nextInt();
                                    sc.nextLine();

                                    alterarProduto(qualProdutoAlterar);

                                }

                                default:
                                    break;
                            }

                        }

                        break;
                    }

                    case "3": {
                        System.out.println("==== LISTAR TODOS OS PRODUTOS ====");
                        if (list.isEmpty()) {
                            System.out.println("---> Lista está vazia");
                            System.out.println();
                        } else {
                            buscarProdutos();
                        }

                        break;
                    }
                    case "4": {
                        System.out.println("==== REMOVER PRODUTO ====");

                        if (list.isEmpty()) {
                            System.out.println("---> Lista está vazia");
                            System.out.println();
                        } else {
                            System.out.println("Produtos disponívels: ");
                            buscarProdutos();

                            System.out.println("Qual produto gostaria de remover? ");
                            int produtoRemover = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < list.size(); i++) {
                                int temp = list.size();
                                if (produtoRemover == i) {
                                    list.remove(i);
                                    System.out.println("---> Produto removido com sucesso");
                                } else if (produtoRemover > temp || produtoRemover < 0) {
                                    System.out.println("numero inválido, digite outro");
                                }

                            }

                        }

                        break;
                    }
                    default: {
                        System.out.println("Essa opção não existe, escolha novamente");
                        break;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

        }

    }

    public static void alterarProduto(int qualProdutoAlterar) {

        try {
            for (int i = 0; i < list.size(); i++) {
                if (qualProdutoAlterar == i) {
                    System.out.print("Digite o novo ID: ");
                    Long id = sc.nextLong();
                    list.get(i).setId(id);
                    System.out.println("----> ID do produto alterado");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void buscarProdutos() {
        try {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("\t" + "[" + i + "]" + list.get(i).getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
