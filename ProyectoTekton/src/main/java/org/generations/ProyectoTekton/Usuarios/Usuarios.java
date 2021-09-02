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

        public Usuarios(Long idusuarios, int tipo, String descripcionusuario, String nombre, int estrellas, String email, String telefono, String pwd, Long idubicacion, String imgperfil) {
            this.idusuarios = idusuarios;
            this.tipo = tipo;
            this.descripcionusuario = descripcionusuario;
            this.nombre = nombre;
            this.estrellas = estrellas;
            this.email = email;
            this.telefono = telefono;
            this.pwd = pwd;
            this.idubicacion = idubicacion;
            this.imgperfil=imgperfil;
        }

        public void setImg_perfil(String img_perfil) {
            this.imgperfil = img_perfil;
        }

        public String getImg_perfil() {
            return imgperfil;
        }

        public Usuarios() {
        }//default constructor

        public void setId_usuarios(Long id_usuarios) {
            this.idusuarios = idusuarios;
        }

        public void setTipo(int tipo) {
            tipo = tipo;
        }

        public void setDescripcion_usuario(String descripcion_usuario) {
            this.descripcionusuario = descripcion_usuario;
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

        public void setContrasena(String contrasena) {
            this.pwd = contrasena;
        }

        public void setId_ubicacion(Long id_ubicacion) {
            this.idubicacion = id_ubicacion;
        }

        public Long getId_usuarios() {
            return idusuarios;
        }

        public int getTipo() {
            return tipo;
        }

        public String getDescripcion_usuario() {
            return descripcionusuario;
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

        public String getContrasena() {
            return pwd;
        }

        public Long getId_ubicacion() {
            return idubicacion;
        }
}// class Employee
