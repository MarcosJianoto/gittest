package aprendizPoo1.entities;

public class Pessoa {

    private String name;
    private String endereco;
    private Integer idade;

    public Pessoa() {
    }

    public Pessoa(String name, String endereco, Integer idade) {
        this.name = name;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String toString() {
        return name + " " + idade + " " + endereco;
    }

}
