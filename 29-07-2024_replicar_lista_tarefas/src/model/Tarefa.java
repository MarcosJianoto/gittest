package model;

public class Tarefa {

    private int id;
    private String titulo;
    private Boolean finalizada;
    private int idUsuario;

    public Tarefa(String titulo, Boolean finalizada) {
        this.titulo = titulo;
        this.finalizada = finalizada;
    }

    public Tarefa(int id, String titulo, Boolean finalizada) {
        this.id = id;
        this.titulo = titulo;
        this.finalizada = finalizada;
    }

    public Tarefa(int id, String titulo, Boolean finalizada, int idUsuario) {
        this.id = id;
        this.titulo = titulo;
        this.finalizada = finalizada;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return " Titulo='" + getTitulo() + "'" +
                ", Finalizada='" + isFinalizada();

    }

}
