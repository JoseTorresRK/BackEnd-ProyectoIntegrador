package org.generations.ProyectoTekton.Usuarios;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    public final ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
    public UsuarioService(){
        lista.add(new Usuarios(1,"Osmar Axel Ramos Garduño",
                1,4,"Jardinero General",
                "localhost:5050/img.png","axl090696@gmail.com",
                1));
        lista.add(new Usuarios(2,"Oscar Martinez de la O",
                1,5,"Herrero Experimentado",
                "localhost:5050/img2.png","oscar_mtz_dlo@gmail.com",
                2));
        lista.add(new Usuarios(3,"Victor Martinez de la O",
                0,4,"Empleador de la empresa Tektôn",
                "localhost:5050/img3.png","victor_mtz_dlo@gmail.com",
                3));
    }// Constructor

    public List<Usuarios> getUsuarios(){return lista;}//getUsuarios

    public Usuarios getUsuariosbyId(Long usuarioId){ return lista.get(usuarioId.intValue()-1);}

    public void deleteUsuarios(Long usuarioId){
        if(usuarioId<=lista.size()){
            lista.remove(usuarioId.intValue()-1);
        }
    }// deleteUsuarios

    public void addUsuarios (Usuarios usuario){lista.add(usuario);} //addUsuarios

    public void updateUsuarios(Long usuariosId, String nombre, int tipo, int estrellas,
                               String descripcion_usuario, String img_perfil, String email){
        if(usuariosId<=lista.size()) {
            Usuarios temporalUsuario = lista.get(usuariosId.intValue()-1);
            if (nombre != null) temporalUsuario.setNombre(nombre);
            if (tipo >= 0) temporalUsuario.setTipo(tipo);
            if (estrellas>0) temporalUsuario.setEstrellas(estrellas);
            if (descripcion_usuario!=null) temporalUsuario.setDescripcion_usuario(descripcion_usuario);
            if (img_perfil != null) temporalUsuario.setImg_perfil(img_perfil);
            if (email != null) temporalUsuario.setEmail(email);
        }
    }
}// UsuariosService
