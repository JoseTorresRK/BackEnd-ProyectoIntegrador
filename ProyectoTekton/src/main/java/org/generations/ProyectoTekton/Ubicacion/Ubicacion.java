package org.generations.ProyectoTekton.Ubicacion;

import javax.persistence.*;
@Entity
@Table(name="ubicacion")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idubicacion", unique = true, nullable = false)
    private Long id_ubicacion;
    @Column(name="estado", nullable = false)
    private String estado;
    @Column(name="municipio", nullable = false)
    private String municipio;
    @Column(name="calle", nullable = false)
    private String calle;
    @Column(name="codigopostal", nullable = false)
    private String codigo_postal;
    @Column(name="numeroext", nullable = false)
    private String num_ext;
    @Column(name="numeroint", nullable = false)
    private String num_int;

    public Ubicacion(Long id_ubicacion, String estado,
                     String municipio, String calle, String codigo_postal,
                     String num_ext, String num_int) {
        this.id_ubicacion = id_ubicacion;
        this.estado = estado;
        this.municipio = municipio;
        this.calle = calle;
        this.codigo_postal = codigo_postal;
        this.num_ext = num_ext;
        this.num_int = num_int;
    }// constructor

    //Getter and Setter

    public Long getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(Long id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getNum_ext() {
        return num_ext;
    }

    public void setNum_ext(String num_ext) {
        this.num_ext = num_ext;
    }

    public String getNum_int() {
        return num_int;
    }

    public void setNum_int(String num_int) {
        this.num_int = num_int;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id_ubicacion;='" + id_ubicacion + '\'' +
                ", estado='" + estado + '\'' +
                ", municipio='" + municipio + '\'' +
                ", calle=" + calle +
                ", codigo_postal='" + codigo_postal + '\'' +
                ", num_ext='" + num_ext + '\'' +
                ", num_int=" + num_int +
                '}';
    }
}// Ubicacion
