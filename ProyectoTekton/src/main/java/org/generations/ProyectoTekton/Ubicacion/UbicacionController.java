package org.generations.ProyectoTekton.Ubicacion;

import org.generations.ProyectoTekton.Usuarios.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/ubicacion")
public class UbicacionController {
    private final UbicacionService ubicacionService;

    @Autowired
    public UbicacionController ( UbicacionService ubicacionService){

        this.ubicacionService = ubicacionService;
    }
    @PostMapping
    public void addUbicacion (@RequestBody Ubicacion objUbicacion){
        ubicacionService.addUbicacion(objUbicacion);
    }//addUbicacion

    @GetMapping(path="{idubicacion}")
    public Ubicacion getUbicacion( @PathVariable("idubicacion") Long idubicacion){
        return ubicacionService.getUbicacion(idubicacion);
    }


    // DELETE usuario por ID
    @DeleteMapping( path = "{idubicacion}")
    public void deleteUbicacionbyId(
            @PathVariable ("idubicacion") Long idubicacion){
        ubicacionService.(usuariosId);
    }// DELETE usuario por ID
    @DeleteMapping( path = "{usuariosId}")
    public void deleteUsuariobyId(
            @PathVariable ("usuariosId") Long usuariosId){
        usuarioService.deleteUsuarios(usuariosId);
    }
}