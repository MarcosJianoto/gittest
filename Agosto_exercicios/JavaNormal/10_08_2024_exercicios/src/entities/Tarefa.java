package entities;

public class Tarefa {

    private String name;
    private boolean finalizada;

    public Tarefa(String name, boolean finalizada) {
        this.name = name;
        this.finalizada = finalizada;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
