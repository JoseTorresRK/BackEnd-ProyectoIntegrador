package org.generations.ProyectoTekton.Resenas;

public class Resena {
    private Long id_resena;
    private String nombre_trabajo;
    private String descripcion;
    private int estrellas;

    public Resena(Long id_resena, String nombre_trabajo, String descripcion, int estrellas) {
        this.id_resena = id_resena;
        this.nombre_trabajo = nombre_trabajo;
        this.descripcion = descripcion;
        this.estrellas = estrellas;
    }// contructor

    public Long getId_resena() {
        return id_resena;
    }//get resena

    public String getNombre_trabajo() {
        return nombre_trabajo;
    }//get nombre_trabajo

    public String getDescripcion() {
        return descripcion;
    }//get descripcion

    public int getEstrellas() {
        return estrellas;
    }// get estrellas
//setters

    public void setId_resena(Long id_resena) {
        this.id_resena = id_resena;
    }

    public void setNombre_trabajo(String nombre_trabajo) {
        this.nombre_trabajo = nombre_trabajo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return "Resena{" +
                "id_resena=" + id_resena +
                ", nombre_trabajo='" + nombre_trabajo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estrellas=" + estrellas +
                '}';
    }
}// class resena
