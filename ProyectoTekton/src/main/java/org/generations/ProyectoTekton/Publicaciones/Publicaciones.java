package org.generations.ProyectoTekton.Publicaciones;

import javax.persistence.*;

@Entity
@Table(name="Publicaciones")
public class Publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name ="idpublicaciones", unique = true, nullable = false)
    private Long idpublicaciones;

    @Column(name ="nombretrabajo", nullable = true)
    private String nombretrabajo;

    @Column(name ="descripcion", nullable = true)
    private String descripcion;

    @Column(name ="preciofinal", nullable = true)
    private double preciofinal;

    @Column(name ="estatustrabajo", nullable = true)
    private String estatustrabajo;

    @Column(name ="idcliente", nullable = false)
    private int idcliente;

    @Column(name ="idubicacion", nullable = false)
    private int idubicacion;

    @Column(name ="idtrabajador", nullable = true)
    private int idtrabajador;

    public Publicaciones(Long idpublicaciones, String nombretrabajo, String descripcion, double preciofinal, String estatustrabajo, int idcliente, int idubicacion, int idtrabajador) {
        this.idpublicaciones = idpublicaciones;
        this.nombretrabajo = nombretrabajo;
        this.descripcion = descripcion;
        this.preciofinal = preciofinal;
        this.estatustrabajo = estatustrabajo;
        this.idcliente = idcliente;
        this.idubicacion = idubicacion;
        this.idtrabajador = idtrabajador;
    }

    public Publicaciones() {
    }

    public Long getIdpublicaciones() {
        return idpublicaciones;
    }

    public void setIdpublicaciones(Long idpublicaciones) {
        this.idpublicaciones = idpublicaciones;
    }

    public String getNombretrabajo() {
        return nombretrabajo;
    }

    public void setNombretrabajo(String nombretrabajo) {
        this.nombretrabajo = nombretrabajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    public String getEstatustrabajo() {
        return estatustrabajo;
    }

    public void setEstatustrabajo(String estatustrabajo) {
        this.estatustrabajo = estatustrabajo;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(int idubicacion) {
        this.idubicacion = idubicacion;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    @Override
    public String toString() {
        return "Publicaciones{" +
                "idpublicaciones=" + idpublicaciones +
                ", nombretrabajo='" + nombretrabajo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", preciofinal=" + preciofinal +
                ", estatustrabajo='" + estatustrabajo + '\'' +
                ", idcliente=" + idcliente +
                ", idubicacion=" + idubicacion +
                ", idtrabajador=" + idtrabajador +
                '}';
    }
}//Publicaciones
