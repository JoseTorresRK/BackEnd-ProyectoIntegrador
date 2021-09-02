package org.generations.ProyectoTekton.Ubicacion;

import javax.persistence.*;
@Entity
@Table(name="Ubicacion")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="idubicacion", unique = true, nullable = false)
    private Long idubicacion;

    @Column(name="estado", nullable = false)
    private String estado;

    @Column(name="municipio", nullable = false)
    private String municipio;

    @Column(name="calle", nullable = false)
    private String calle;

    @Column(name="codigopostal", nullable = false)
    private String codigopostal;

    @Column(name="numeroext", nullable = false)
    private String numeroext;

    @Column(name="numeroint")
    private String numeroint;

    @Column(name="latitud")
    private float latitud;

    @Column(name="longitud")
    private float longitud;

    public Ubicacion(Long idubicacion, String estado, String municipio,
                     String calle, String codigopostal, String numeroext,
                     String numeroint, float latitud, float longitud) {
        this.idubicacion = idubicacion;
        this.estado = estado;
        this.municipio = municipio;
        this.calle = calle;
        this.codigopostal = codigopostal;
        this.numeroext = numeroext;
        this.numeroint = numeroint;
        this.latitud = latitud;
        this.longitud = longitud;
    }//constructor

    public Ubicacion(){}//constructor por default

    public Long getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(Long idubicacion) {
        this.idubicacion = idubicacion;
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

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getNumeroext() {
        return numeroext;
    }

    public void setNumeroext(String numeroext) {
        this.numeroext = numeroext;
    }

    public String getNumeroint() {
        return numeroint;
    }

    public void setNumeroint(String numeroint) {
        this.numeroint = numeroint;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }


    // --Getters --Setters


    @Override
    public String toString() {
        return "Ubicacion{" +
                "idubicacion=" + idubicacion +
                ", estado='" + estado + '\'' +
                ", municipio='" + municipio + '\'' +
                ", calle='" + calle + '\'' +
                ", codigopostal='" + codigopostal + '\'' +
                ", numeroext='" + numeroext + '\'' +
                ", numeroint='" + numeroint + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}// Ubicacion
