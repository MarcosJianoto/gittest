
public class Tarefa {

    private String titulo;
    private Boolean finalizada;

    public Tarefa(String titulo, Boolean finalizada) {
        this.titulo = titulo;
        this.finalizada = finalizada;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean isFinalizada() {
        return this.finalizada;
    }

    public Boolean getFinalizada() {
        return this.finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public String toString() {
        return " Titulo='" + getTitulo() + "'" +
                ", Finalizada='" + isFinalizada();

    }

}
