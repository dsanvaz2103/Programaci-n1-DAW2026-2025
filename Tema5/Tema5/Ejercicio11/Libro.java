package Tema5.Ejercicio11;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    // 1. Constructor
    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    // 2. Sobrescribir toString()
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + anioPublicacion;
    }

    // 3. Sobrescribir equals()
    @Override
    public boolean equals(Object obj) {
        // Si apuntan a la misma dirección de memoria
        if (this == obj) return true;

        // Si el objeto es nulo o no es de la misma clase
        if (obj == null || getClass() != obj.getClass()) return false;

        // Conversión (cast) y comparación del atributo clave
        Libro otroLibro = (Libro) obj;
        return Objects.equals(this.isbn, otroLibro.isbn);
    }

    // Es buena práctica sobrescribir también hashCode() cuando se toca equals()
    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
