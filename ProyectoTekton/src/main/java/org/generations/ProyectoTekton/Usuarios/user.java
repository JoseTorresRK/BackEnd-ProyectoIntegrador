package org.generations.ProyectoTekton.Usuarios;

// Plain Old Java Object -- POJO
//Usuarios

//import javax.persistence.*;

@Entity
@Table(name="Usuarios")
    public class user { // Plan Old Java Object - POJO
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "idUsuarios", unique = true, nullable = false)
        private Long id_usuarios;
        @Column(name = "Tipo", nullable = false)
        private int Tipo;
        @Column(name = "descipcion_usuario", nullable = false)
        private String descripcion_usuario;
        @Column(name = "img_perfil")
        private String img_perfil;
        @Column(name = "nombre", nullable = false)
        private String nombre;
        @Column(name = "estrellas", nullable = false)
        private int estrellas;
        @Column(name = "email", nullable = false)
        private String email;
        @Column(name = "telefono", nullable = false)
        private String telefono;
        @Column(name = "contrasena", nullable = false)
        private String contrasena;
        @Column(name = "id_ubicacion")
        private Long id_ubicacion;

        public user(Long id_usuarios, int tipo, String descripcion_usuario, String nombre, int estrellas, String email, String telefono, String description, Long id_ubicacion,String img_perfil) {
            this.id_usuarios = id_usuarios;
            Tipo = tipo;
            this.descripcion_usuario = descripcion_usuario;
            this.nombre = nombre;
            this.estrellas = estrellas;
            this.email = email;
            this.telefono = telefono;
            this.contrasena = description;
            this.id_ubicacion = id_ubicacion;
            this.img_perfil=img_perfil;
        }

        public void setImg_perfil(String img_perfil) {
            this.img_perfil = img_perfil;
        }

        public String getImg_perfil() {
            return img_perfil;
        }

        public user() {
        }//default constructor

        public void setId_usuarios(Long id_usuarios) {
            this.id_usuarios = id_usuarios;
        }

        public void setTipo(int tipo) {
            Tipo = tipo;
        }

        public void setDescripcion_usuario(String descripcion_usuario) {
            this.descripcion_usuario = descripcion_usuario;
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
            this.contrasena = contrasena;
        }

        public void setId_ubicacion(Long id_ubicacion) {
            this.id_ubicacion = id_ubicacion;
        }

        public Long getId_usuarios() {
            int a;
            return id_usuarios;
        }

        public int getTipo() {
            return Tipo;
        }

        public String getDescripcion_usuario() {
            return descripcion_usuario;
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
            return contrasena;
        }

        public Long getId_ubicacion() {
            return id_ubicacion;
        }
}// class Employee
