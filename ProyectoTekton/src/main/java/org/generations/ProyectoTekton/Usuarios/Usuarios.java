package org.generations.ProyectoTekton.Usuarios;

// Plain Old Java Object -- POJO
//Usuarios

import javax.persistence.*;

@Entity
@Table(name="usuarios")
    public class Usuarios { // Plan Old Java Object - POJO
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "idusuarios", unique = true, nullable = false)
        private Long idusuarios;
        @Column(name = "tipo", nullable = false)
        private int tipo;
        @Column(name = "descripcionusuario", nullable = false)
        private String descripcionusuario;
        @Column(name = "imgperfil")
        private String imgperfil;
        @Column(name = "nombre", nullable = false)
        private String nombre;
        @Column(name = "estrellas", nullable = false)
        private int estrellas;
        @Column(name = "email", nullable = false)
        private String email;
        @Column(name = "telefono", nullable = false)
        private String telefono;
        @Column(name = "pwd", nullable = false)
        private String pwd;
        @Column(name = "idubicacion",nullable = false)
        private Long idubicacion;
        @Column(name= "categoria",nullable = true)
        private String categoria;
        @Column(name="subcategoria",nullable = true)
        private String subcategoria;

    public Usuarios(Long idusuarios, int tipo, String descripcionusuario, String imgperfil, String nombre, int estrellas, String email, String telefono, String pwd, Long idubicacion, String categoria, String subcategoria) {
        this.idusuarios = idusuarios;
        this.tipo = tipo;
        this.descripcionusuario = descripcionusuario;
        this.imgperfil = imgperfil;
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.email = email;
        this.telefono = telefono;
        this.pwd = pwd;
        this.idubicacion = idubicacion;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
    }

    public void setIdusuarios(Long idusuarios) {
        this.idusuarios = idusuarios;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Usuarios() {
    }

    public void setDescripcionusuario(String descripcionusuario) {
        this.descripcionusuario = descripcionusuario;
    }

    public void setImgperfil(String imgperfil) {
        this.imgperfil = imgperfil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setIdubicacion(Long idubicacion) {
        this.idubicacion = idubicacion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Long getIdusuarios() {
        return idusuarios;
    }

    public int getTipo() {
        return tipo;
    }

    public String getDescripcionusuario() {
        return descripcionusuario;
    }

    public String getImgperfil() {
        return imgperfil;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPwd() {
        return pwd;
    }

    public Long getIdubicacion() {
        return idubicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "idusuarios=" + idusuarios +
                ", tipo=" + tipo +
                ", descripcionusuario='" + descripcionusuario + '\'' +
                ", imgperfil='" + imgperfil + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estrellas=" + estrellas +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", pwd='" + pwd + '\'' +
                ", idubicacion=" + idubicacion +
                '}';
    }


}// class Employee
