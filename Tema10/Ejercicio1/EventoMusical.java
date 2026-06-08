package Tema10.Ejercicios.Ejercicio1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EventoMusical implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private Date fecha;
    private BigDecimal recaudacion;

    // Constructor sin parámetros (Obligatorio en POJOs para persistencia)
    public EventoMusical() {
    }

    // Constructor con parámetros
    public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    // Getters y Setters
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
}