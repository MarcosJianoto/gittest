package ListaDeTarefas;

public class Tarefa {

    private String titulo;
    private boolean finalizada;

    public Tarefa() {
    }

    public Tarefa(String titulo, boolean finalizada) {
        this.titulo = titulo;
        this.finalizada = finalizada;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isFinalizada() {
        return this.finalizada;
    }

    public boolean getFinalizada() {
        return this.finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

}
