package aprendizPoo9.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private String autor;
    private LocalDate anoPublicacao;
    private String genero;

    List<Livro> list = new ArrayList<>();

    public Livro() {
    }

    public Livro(String titulo, String autor, LocalDate anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(LocalDate anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Livro> getList() {
        return this.list;
    }

    public void inserirLivro(Livro livro) {
        list.add(livro);
    }

    public void livroEmprestado(int livro) {
        if (!list.isEmpty()) {
            list.remove(livro);
            System.out.printf("O Livro %d foi emprestado!", livro);
        } else {
            System.out.println("Lista vazia, não sendo possível emprestar");
        }

    }

    public void devolverLivro() {
        System.out.println("O Livro foi devolvido");
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", autor='" + getAutor() + "'" +
                ", anoPublicacao='" + getAnoPublicacao() + "'" +
                ", genero='" + getGenero() + "'" +
                "}";
    }

}
