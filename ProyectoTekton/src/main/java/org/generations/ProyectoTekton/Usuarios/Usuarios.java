package org.generations.ProyectoTekton.Usuarios;

// Plain Old Java Object -- POJO
//Usuarios

import java.util.ArrayList;
import java.util.Arrays;

public class Usuarios {
    private int id_usuarios;
    private String nombre;
    private int tipo;
    private int estrellas;
    private String descripcion_usuario;
    private String img_perfil;
    private String email;
    private int idUbicacion;
    private ArrayList<String> categorias;
    private ArrayList<String> subcategorias;

    public Usuarios(int id_usuarios, String nombre, int tipo, int estrellas,
            String descripcion_usuario, String img_perfil, String email,
             int idUbicacion, ArrayList<String> categorias, ArrayList<String> subcategorias) {
        this.id_usuarios = id_usuarios;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estrellas = estrellas;
        this.descripcion_usuario = descripcion_usuario;
        this.img_perfil = img_perfil;
        this.email = email;
        this.idUbicacion = idUbicacion;
        this.categorias = categorias;
        this.subcategorias = subcategorias;
    }

    /*
    public Usuarios(int id_usuarios, String nombre, int tipo, int estrellas,
                    String descripcion_usuario, String img_perfil, String email,
                    int idUbicacion) {
        this.id_usuarios = id_usuarios;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estrellas = estrellas;
        this.descripcion_usuario = descripcion_usuario;
        this.img_perfil = img_perfil;
        this.email = email;
        this.idUbicacion = idUbicacion;
    }
    */

    public int getId_usuarios() {
        return id_usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public String getDescripcion_usuario() {
        return descripcion_usuario;
    }

    public String getImg_perfil() {
        return img_perfil;
    }

    public String getEmail() {
        return email;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public ArrayList<String> getSubcategorias() {
        return subcategorias;
    }
    //Setters


    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public void setDescripcion_usuario(String descripcion_usuario) {
        this.descripcion_usuario = descripcion_usuario;
    }

    public void setImg_perfil(String img_perfil) {
        this.img_perfil = img_perfil;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }

    public void setSubcategorias(ArrayList<String> subcategorias) {
        this.subcategorias = subcategorias;
    }
    /*
    @Override
    public String toString() {
        return "Usuarios{" +
                "id_usuarios=" + id_usuarios +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", estrellas=" + estrellas +
                ", descripcion_usuario='" + descripcion_usuario + '\'' +
                ", img_perfil='" + img_perfil + '\'' +
                ", email='" + email + '\'' +
                ", idUbicacion=" + idUbicacion +
                ", categorias=" + categorias +
                ", subcategorias=" + subcategorias +
                '}';
    }
    public void setCategorias(Categoria[] categorias) {
        this.categorias = categorias;
    }

    public void setSubcategorias(Subcategoria[] subcategorias) {
        this.subcategorias = subcategorias;
    }*/

    @Override
    public String toString() {
        return "Usuarios{" +
                "id_usuarios=" + id_usuarios +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", estrellas=" + estrellas +
                ", descripcion_usuario='" + descripcion_usuario + '\'' +
                ", img_perfil='" + img_perfil + '\'' +
                ", email='" + email + '\'' +
                ", idUbicacion=" + idUbicacion +
                ", categorias=" + Arrays.toString(new ArrayList[]{categorias}) +
                ", subcategorias=" + Arrays.toString(new ArrayList[]{subcategorias}) +
                '}';
    }
    /*
     @Override
    public String toString() {
        return "Usuarios{" +
             "id_usuarios;='" + id_usuarios + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estrellas=" + estrellas +
                ", descripcion_usuario='" + descripcion_usuario + '\'' +
                ", img_perfil='" + img_perfil + '\'' +
                ", email=" + email +
                ", idUbicacion='" + idUbicacion + '\'' +
                '}';
    }//toString
    */
}// class Employee
