import java.util.ArrayList;

public class Usuario {

    private String email;
    private String senha;
    private ArrayList<Tarefa> tarefas;

    public Usuario() {
    }

    public Usuario(String email, String senha, ArrayList<Tarefa> tarefas) {
        this.email = email;
        this.senha = senha;
        this.tarefas = tarefas;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Tarefa> getTarefas() {
        return this.tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public String toString() {
        return "{" +
                " email='" + getEmail() + "'" +
                ", senha='" + getSenha() + "'" +
                "}";
    }

}
