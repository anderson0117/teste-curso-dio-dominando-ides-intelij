package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class FristProgram {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("O Mochileiro das Galáxias", 240);

        System.out.println(gato);
        System.out.println(livro);


    }
}

class Livro{
    private String nome;
    private Integer numPages;

    public Livro(String nome, Integer numPages) {
        this.nome = nome;
        this.numPages = numPages;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPages, livro.numPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPages);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}