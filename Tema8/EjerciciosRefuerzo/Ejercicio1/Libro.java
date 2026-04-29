package UD8.EjerciciosRefuerzo.Ejercicio1;

public class Libro implements Comparable<Libro> {
    String isbn;
    String titulo;
    String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    //Ordenar natural por ISBN para el TreeSet

    @Override
    public int compareTo(Libro libro) {
        return this.isbn.compareTo(libro.isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
}
