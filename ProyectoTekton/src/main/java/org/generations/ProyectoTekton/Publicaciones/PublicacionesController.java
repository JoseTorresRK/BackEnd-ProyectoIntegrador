package org.generations.ProyectoTekton.Publicaciones;

import org.generations.ProyectoTekton.Publicaciones.Publicaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/publicacion")
public class PublicacionesController {
    private final PublicacionesServicie publicacionesServicie;
    
    @Autowired
    public PublicacionesController(PublicacionesServicie publicacionesServicie){
        this.publicacionesServicie = publicacionesServicie;
    }

    // Get lista usuarios
    @GetMapping
    public List<Publicaciones> getPublicaciones() {return publicacionesServicie.getPublicaciones();}

    // Get Publicaciones por ID
    @GetMapping( path = "{publicacionId}")
    public Publicaciones getPublicacionesbyId(@PathVariable("publicacionId") Long publicacionId){
        return publicacionesServicie.getPublicacionesbyId(publicacionId);
    }

    // DELETE publicacion por ID
    @DeleteMapping( path = "{publicacionId}")
    public void deletePublicacionesbyId(
            @PathVariable ("publicacionId") Long publicacionId){
        publicacionesServicie.deletePublicaciones(publicacionId);
    }

    //POST publicacion

    @PostMapping
    public void addPublicaciones(@RequestBody Publicaciones publicacion){
        publicacionesServicie.addPublicaciones(publicacion);
    }
    
    //PUT publicacion

    @PutMapping( path = "{publicacionId}")
    public void updatePublicaciones(@PathVariable("publicacionId") Long publicacionId,
                                    @RequestParam(required=false) String nombre_trabajo,
                                    @RequestParam(required=false) String descripcion,
                                    @RequestParam(required=false) double precio_final,
                                    @RequestParam(required=false) String estatus_trabajo,
                                    @RequestParam(required=false) int idTrabajador,
                                    @RequestParam(required=false) int idUbicacion){
        publicacionesServicie.updatePublicaciones(publicacionId,nombre_trabajo,
                descripcion,precio_final,estatus_trabajo,idTrabajador, idUbicacion);
    } // updatePublicaciones
}
