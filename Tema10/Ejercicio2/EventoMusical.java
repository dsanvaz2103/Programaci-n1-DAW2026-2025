package Tema10.Ejercicios.Ejercicio2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class EventoMusical implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Clave primaria para cumplir con las restricciones de persistencia

    private String nombre;

    @Temporal(TemporalType.DATE) // Requerido al utilizar java.util.Date
    private Date fecha;

    private BigDecimal recaudacion;

    @Enumerated(EnumType.STRING) // Persiste el nombre del género como un texto alfanumérico
    private GeneroMusical genero;

    // ElementCollection se encarga de almacenar una lista de elementos integrados (@Embeddable)
    @ElementCollection
    private List<Artista> artistasConfirmados = new ArrayList<>();

    // Constructor obligatorio sin parámetros
    public EventoMusical() {
    }

    // Constructor parametrizado
    public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion, GeneroMusical genero) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;
    }

    // Métodos para gestionar la lista de artistas
    public void añadirArtista(Artista artista) {
        this.artistasConfirmados.add(artista);
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public List<Artista> getArtistasConfirmados() {
        return artistasConfirmados;
    }

    public void setArtistasConfirmados(List<Artista> artistasConfirmados) {
        this.artistasConfirmados = artistasConfirmados;
    }
}