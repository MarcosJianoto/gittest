import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class App2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        buscarUsuarios();

    }

    public static void buscarUsuarios() throws SQLException {

        // Java Database Connection //JDBC

        try {

            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");

            PreparedStatement stmt = c.prepareStatement("Select * from lista_tarefas.usuario");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                rs.next();
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String senha = rs.getString("senha");

                System.out.println("id: " + id);
                System.out.println("email: " + email);
                System.out.println("senha: " + senha);
                System.out.println("");
            }

            c.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

}
