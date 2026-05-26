package Tema10.Ejercicio2;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Artista implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombreArtistico;
    private String cache;

    public Artista() {
    }

    public Artista(String nombreArtistico, String cache) {
        this.nombreArtistico = nombreArtistico;
        this.cache = cache;
    }

    // Getters y Setters
    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }
}