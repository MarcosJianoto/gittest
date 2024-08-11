
import java.util.ArrayList;

public class MySQLJava {

    public static void main(String[] args) {

        System.out.println("==== USUARIOS CADASTRADOS ====");
        ArrayList<Usuario> usuarios = UsuarioDAO.readUsers();

        for (Usuario u : usuarios) {
            System.out.println("Id: " + u.getId());
            System.out.println("Email: " + u.getEmail());
            System.out.println("Senha: " + u.getSenha());
            System.out.println("");
        }

    }

}
