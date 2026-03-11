package Tema5.Ejercicio7.Clases;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' +  ", autor='" + autor + '\'' + ", isbn='" + isbn + '\'' + ", anioPublicacion=" + anioPublicacion + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return anioPublicacion == libro.anioPublicacion && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, isbn, anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
