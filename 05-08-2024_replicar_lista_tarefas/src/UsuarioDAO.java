
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class UsuarioDAO {

    // CONSTANTES
    public static final Scanner sc = new Scanner(System.in);
    public static Connection c = null;
    public static PreparedStatement stmt = null;
    public static ResultSet rs = null;

    public static final String URL = "jdbc:mysql://localhost:3306";
    public static final String USER = "root";
    public static final String password = "";

    private static final String INSERT_SQL = "INSERT INTO lista_tarefas.usuario (email, senha) VALUES (?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM lista_tarefas.usuario";
    private static final String UPDATE_SQL = "UPDATE * FROM lista_tarefas.usuario SET email = ?, senha = ? WHERE id = ? ";
    private static final String DELETE_SQL = "DELETE FROM lista_tarefas.usuario WHERE id = ?";

    public static boolean createUsers(Usuario u) {

        boolean successo = false;

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            c = DriverManager.getConnection(URL, USER, password);

            stmt = c.prepareStatement(INSERT_SQL);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                successo = true;
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
        return successo;

    }

    public static ArrayList<Usuario> readUsers() {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            stmt = c.prepareStatement(SELECT_SQL);

            rs = stmt.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String email = rs.getString("email");
                String senha = rs.getString("senha");

                Usuario u = new Usuario(id, email, senha);
                usuarios.add(u);

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
        return usuarios;

    }

    public static boolean updateUsers(Usuario u) {

        boolean sucesso = false;

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            c = DriverManager.getConnection(URL, USER, password);

            stmt = c.prepareStatement(UPDATE_SQL);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getId());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                sucesso = true;
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
        return sucesso;

    }

    public static boolean deleteUsers(Usuario u) {

        boolean sucesso = false;

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            c = DriverManager.getConnection(URL, USER, password);

            stmt = c
                    .prepareStatement(DELETE_SQL);

            stmt.setInt(1, u.getId());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                sucesso = true;
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
        return sucesso;

    }

}
