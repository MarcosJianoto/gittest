import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class MySQLExemplo {

    // final = constante
    private static final String DB_URL = "jdbc:mysql://localhost:3306";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private static final String SELECT_SQL = "SELECT * FROM lista_tarefas.usuario";
    private static final String INSERT_SQL = "INSERT INTO lista_tarefas.usuario (email, senha) VALUES (? , ?)";
    private static final String UPDATE_SQL = "UPDATE lista_tarefas.usuario SET email = ?, senha = ? WHERE id = ? ";
    private static final String DELETE_SQL = "DELETE FROM lista_tarefas.usuario WHERE id = ?";

    public static Scanner sc = new Scanner(System.in);
    public static String email, senha;
    public static int id;

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        Boolean rodando = true;

        while (rodando) {
            System.out.println("O que você gostaria de fazer? ");
            System.out.println("[1] Buscar usuários");
            System.out.println("[2] Cadastrar usuários");
            System.out.println("[3] Atualizar usuários");
            System.out.println("[4] Deletar usuários");
            System.out.println("[5] Finalizar CRUD");
            System.out.println();
            System.out.print("----> Digite a opção desejada: ");
            String crud = sc.nextLine();

            switch (crud) {
                case "1":
                    buscarUsuario();
                    break;
                case "2":
                    inserirUsuario();
                    break;
                case "3":
                    atualizarUsuario();
                    break;
                case "4":
                    deletarUsuario();
                    break;
                case "5":
                    rodando = false;
                    break;
            }
        }

        sc.close();

    }

    public static ArrayList<Usuario> buscarUsuario() {

        ArrayList<Usuario> usuario = new ArrayList<>();

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection(DB_URL);

            PreparedStatement stmt = c.prepareStatement(SELECT_SQL);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String email = rs.getString("email");
                String senha = rs.getString("senha");

                Usuario u = new Usuario(id, email, senha);
                usuario.add(u);
            }

            c.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return usuario;

    }

    public static boolean inserirUsuario() {

        boolean success = false;

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            PreparedStatement stmt = c.prepareStatement(INSERT_SQL);
            stmt.setString(1, email);
            stmt.setString(2, senha);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                success = true;
            }

            c.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;

    }

    public static void atualizarUsuario() {

        buscarUsuario();

        System.out.println("----> Qual ID do usuário gostaria de atualizar? ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("----> Digite o novo e-mail: ");
        email = sc.nextLine();
        System.out.println("----> Digite a nova senha: ");
        senha = sc.nextLine();

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            PreparedStatement stmt = c
                    .prepareStatement(UPDATE_SQL);

            stmt.setString(1, email);
            stmt.setString(2, senha);
            stmt.setInt(3, id);

            int rowsAfffect = stmt.executeUpdate();
            if (rowsAfffect > 0) {
                System.out.println("----> Dados atualizados com sucesso! ");
            } else {
                System.out.println("----> Erro ao atualizar os dados! ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void deletarUsuario() {

        buscarUsuario();

        System.out.print("----> Qual usuário gostaria de deletar? ");

        id = sc.nextInt();
        sc.nextLine();

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            PreparedStatement stmt = c.prepareStatement(DELETE_SQL);
            stmt.setInt(1, id);

            int rowsAfffect = stmt.executeUpdate();
            if (rowsAfffect > 0) {
                System.out.println("----> Usuario do id: " + id + " deletado");
                System.out.println("----------------------------------------");

            } else {
                System.out.println("Erro ao deletar usuário");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
