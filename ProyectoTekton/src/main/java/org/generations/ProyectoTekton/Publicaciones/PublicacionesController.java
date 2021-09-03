package org.generations.ProyectoTekton.Publicaciones;

import org.generations.ProyectoTekton.Publicaciones.Publicaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/publicaciones/")
public class PublicacionesController {
    private final PublicacionesService publicacionesService;

    public PublicacionesController(PublicacionesService publicacionesService) {
        this.publicacionesService = publicacionesService;
    }

    @PostMapping
    public void addpost(@RequestBody Publicaciones objPublicacion) {
        publicacionesService.nuevopost(objPublicacion);

    }
    @GetMapping
    public  List<Publicaciones> listapost(){
        return publicacionesService.listaPost();
    }
}
