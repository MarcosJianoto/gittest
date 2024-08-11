package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

import model.Tarefa;
import model.Usuario;

public class TarefaDAO {
    public static final String URL = "jdbc:mysql://localhost:3306";
    public static final String USER = "root";
    public static final String password = "";

    private static final String SELECT_BY_USER_ID_SQL = "SELECT * FROM lista_tarefas.tarefa WHERE id_usuario = ?";

    public static ArrayList<Tarefa> buscarTarefasDoUsuario(Usuario u) {

        ArrayList<Tarefa> tarefas = new ArrayList<>();

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection(URL, USER, password);

            PreparedStatement stmt = c.prepareStatement(SELECT_BY_USER_ID_SQL);

            stmt.setInt(1, u.getId());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                boolean finalizada = rs.getBoolean("finalizada");
                int idUsuario = u.getId();

                Tarefa t = new Tarefa(id, titulo, finalizada, idUsuario);
                tarefas.add(t);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tarefas;

    }

}
