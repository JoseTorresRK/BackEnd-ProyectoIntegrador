package org.generations.ProyectoTekton.empleadoscategorias;

public class empleadoscategorias {
    private Long id_empleadoscategorias;
    private int id_usuario;
    private int id_relacion;

    public empleadoscategorias(Long id_empleadoscategorias, int id_usuario, int id_relacion) {
        this.id_empleadoscategorias = id_empleadoscategorias;
        this.id_usuario = id_usuario;
        this.id_relacion = id_relacion;
    }//constructor

    public Long getId_empleadoscategorias() {
        return id_empleadoscategorias;
    }//get empleados categorias

    public int getId_usuario() {
        return id_usuario;
    }//get idusuario

    public int getId_relacion() {
        return id_relacion;
    }//get idrelacion

    //setters


    public void setId_empleadoscategorias(Long id_empleadoscategorias) {
        this.id_empleadoscategorias = id_empleadoscategorias;
    }//set empledoscategoria

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }// set idusuario

    public void setId_relacion(int id_relacion) {
        this.id_relacion = id_relacion;
    }//set idrelacion


    @Override
    public String toString() {
        return "empleadoscategorias{" +
                "id_empleadoscategorias=" + id_empleadoscategorias +
                ", id_usuario=" + id_usuario +
                ", id_relacion=" + id_relacion +
                '}';
    }
}// class empleados categorias

