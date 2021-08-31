package org.generations.ProyectoTekton.Publicaciones;

import org.generations.ProyectoTekton.Usuarios.Usuarios;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicacionesServicie {
    public final ArrayList<Publicaciones> lista = new ArrayList<Publicaciones>();

    // Constructor
    public PublicacionesServicie() {
        lista.add(new Publicaciones(1, "Jardinero para Oficinas",
                "Jardinero para oficinas en el Centro de la Ciudad, Experiencia deseable.", 3000,
                "Pendiente", 1, 4, 3));
        lista.add(new Publicaciones(2, "Herrero para Puerta Principal",
                "Herrero que le agrade trabajar en los detalles con un catalogo de trabajos realizados.",
                10000, "Aceptado", 2, 5, 3));

    } // Constructor

    public List<Publicaciones> getPublicaciones(){return lista;}//getPublicaciones

    public Publicaciones getPublicacionesbyId(Long publicacionId){
        return lista.get(publicacionId.intValue()-1);} // getPublicacionesbyId

    public void deletePublicaciones(Long publicacionId){
        if(publicacionId<=lista.size()){
            lista.remove(publicacionId.intValue()-1);
        }
    }// deletePublicaciones

    public void addPublicaciones(Publicaciones publicacion){lista.add(publicacion);} //addPublicaciones

    public void updatePublicaciones(Long publicacionId, String nombre_trabajo,
                                    String descripcion, double precio_final, String estatus_trabajo,
                                    int idTrabajador,int idUbicacion){
        if(publicacionId<=lista.size()) {
            Publicaciones tempPublicacion = lista.get(publicacionId.intValue()-1);
            if (nombre_trabajo != null) tempPublicacion.setNombre_trabajo(nombre_trabajo);
            if (descripcion != null) tempPublicacion.setDescripcion(descripcion);
            if(precio_final > 0) tempPublicacion.setPrecio_final(precio_final);
            if(estatus_trabajo != null) tempPublicacion.setEstatus_trabajo(estatus_trabajo);
            if(idTrabajador > 0) tempPublicacion.setIdTrabajador(idTrabajador);
            if(idUbicacion >0 ) tempPublicacion.setIdUbicacion(idUbicacion);
        }
    }
}