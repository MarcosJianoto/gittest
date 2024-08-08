
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class MySQLJava {

    public static String URL = "jdbc:mysql://localhost:3306";
    public static String USER = "root";
    public static String password = "";
    public static Connection c = null;
    public static PreparedStatement stmt = null;
    public static ResultSet rs = null;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        readUsers();
    }

    public static void createUsers() {

        System.out.println("Digite seu e-mail: ");
        String email = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            c = DriverManager.getConnection(URL, USER, password);

            stmt = c.prepareStatement("INSERT INTO lista_tarefas.usuario (email, senha) VALUES (?, ?)");
            stmt.setString(1, email);
            stmt.setString(2, senha);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Usuário inserido com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (c != null)
                    c.close();
                if (stmt != null)
                    stmt.close();
                if (rs != null)
                    rs.close();
                if (sc != null) {
                    sc.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public static void readUsers() {

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            stmt = c.prepareStatement("SELECT * FROM lista_tarefas.usuario");

            rs = stmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String email = rs.getString("email");
                String senha = rs.getString("senha");

                System.out.println("id = " + id);
                System.out.println("email = " + email);
                System.out.println("senha = " + senha);
                System.out.println();

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {

                if (c != null)
                    c.close();
                if (stmt != null)
                    stmt.close();
                if (rs != null)
                    rs.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public static void updateUsers() {

        readUsers();

        System.out.print("Digite o id do usuário que gostaria atualizar: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o novo e-mail: ");
        String email = sc.nextLine();
        System.out.println("Digite a nova senha: ");
        String senha = sc.nextLine();

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            c = DriverManager.getConnection(URL, USER, password);

            stmt = c.prepareStatement("UPDATE * FROM lista_tarefas.usuario SET email = ?, senha = ? WHERE id = ? ");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            stmt.setInt(3, id);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Dados foram atualizados com sucesso! ");
            } else {
                System.out.println("ERRO: Dados não foram atualizados");
            }

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            try {
                if (c != null)
                    c.close();
                if (stmt != null)
                    stmt.close();
                if (rs != null)
                    rs.close();

            } catch (Exception e) {

                e.printStackTrace();
            }

        }

    }

    public static void deleteUsers() {

        readUsers();

        System.out.println("Digite o ID do usuário que gostaria de deletar: ");
        int id = sc.nextInt();
        sc.nextLine();

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            c = DriverManager.getConnection(URL, USER, password);

            stmt = c
                    .prepareStatement("DELETE FROM lista_tarefas.usuario WHERE id = ?");

            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Usuário deletado");
            } else {
                System.out.println("Usuário não deletado");
            }

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {

                if (c != null)
                    c.close();
                if (stmt != null)
                    stmt.close();
                if (rs != null)
                    rs.close();
                if (sc != null)
                    sc.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
