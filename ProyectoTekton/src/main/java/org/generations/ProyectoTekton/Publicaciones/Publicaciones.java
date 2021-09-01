package org.generations.ProyectoTekton.Publicaciones;

public class Publicaciones {
    private int id_publicaciones;
    private String nombre_trabajo;
    private String descripcion;
    private double precio_final;
    private String estatus_trabajo;
    private int idTrabajador;
    private int idUbicacion;
    private int idEmpleador;

    //Constructor
    public Publicaciones(int id_publicaciones, String nombre_trabajo,
                         String descripcion, double precio_final,
                         String estatus_trabajo, int idTrabajador,
                         int idUbicacion, int idEmpleador) {
        this.id_publicaciones = id_publicaciones;
        this.nombre_trabajo = nombre_trabajo;
        this.descripcion = descripcion;
        this.precio_final = precio_final;
        this.estatus_trabajo = estatus_trabajo;
        this.idTrabajador = idTrabajador;
        this.idUbicacion = idUbicacion;
        this.idEmpleador = idEmpleador;
    }

    //Getter and Setter

    public int getId_publicaciones() {
        return id_publicaciones;
    }

    public void setId_publicaciones(int id_publicaciones) {
        this.id_publicaciones = id_publicaciones;
    }

    public String getNombre_trabajo() {
        return nombre_trabajo;
    }

    public void setNombre_trabajo(String nombre_trabajo) {
        this.nombre_trabajo = nombre_trabajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public String getEstatus_trabajo() {
        return estatus_trabajo;
    }

    public void setEstatus_trabajo(String estatus_trabajo) {
        this.estatus_trabajo = estatus_trabajo;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public int getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(int idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id_publicaciones;='" + id_publicaciones + '\'' +
                ", nombre_trabajo='" + nombre_trabajo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio_final=" + precio_final +
                ", estatus_trabajo='" + estatus_trabajo + '\'' +
                ", idTrabajador='" + idTrabajador + '\'' +
                ", idUbicacion=" + idUbicacion +
                ", idEmpleador='" + idEmpleador + '\'' +
                '}';
    }
}//Publicaciones
