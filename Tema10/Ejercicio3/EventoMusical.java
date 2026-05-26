package Tema10.Ejercicio3;

import Tema10.Ejercicio2.Artista;
import Tema10.Ejercicio2.GeneroMusical;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class EventoMusical implements Serializable {
    private static final long serialVersionUID = 1L;

    // Configuración para que el ID aumente de 10 en 10
    @Id
    @SequenceGenerator(name = "evento_gen", sequenceName = "evento_seq", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evento_gen")
    private Long id;

    private String nombre;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private BigDecimal recaudacion;

    @Enumerated(EnumType.STRING)
    private GeneroMusical genero;

    @ElementCollection
    private List<Artista> artistasConfirmados = new ArrayList<>();

    // Variable de control que NO se guarda en la base de datos
    @Transient
    private int control;

    // Constructor vacío obligatorio
    public EventoMusical() {
    }

    // Constructor con parámetros
    public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion, GeneroMusical genero) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;
    }

    public void añadirArtista(Artista artista) {
        this.artistasConfirmados.add(artista);
    }

    // Getters y Setters para la variable @Transient
    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    // Resto de Getters y Setters
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