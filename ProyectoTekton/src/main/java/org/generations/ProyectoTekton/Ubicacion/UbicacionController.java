package org.generations.ProyectoTekton.Ubicacion;

import org.generations.ProyectoTekton.Usuarios.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/ubicacion")
// @CrossOrigin configurar el origen en produccion para una ruta especifico o pagina, quitar la linea completa
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UbicacionController {
    private final UbicacionService ubicacionService;

    @Autowired
    public UbicacionController ( UbicacionService ubicacionService){

        this.ubicacionService = ubicacionService;
    }
    @GetMapping("/ultima")
    public Ubicacion getUltima(){
        return ubicacionService.getUltimaUbicacion();
    }
    @GetMapping
    public List<Ubicacion> getUbicacion(){return ubicacionService.getUbicacion();}

    @PostMapping
    public Ubicacion addUbicacion (@RequestBody Ubicacion objUbicacion){
        ubicacionService.addUbicacion(objUbicacion);
        return objUbicacion;
    }//addUbicacion

    @GetMapping(path="{idubicacion}")
    public Ubicacion getUbicacion( @PathVariable("idubicacion") Long idubicacion){
        return ubicacionService.getUbicacionbyId(idubicacion);
    }


    // DELETE usuario por ID
    @DeleteMapping( path = "{idubicacion}")
    public void deleteUbicacionbyId(
            @PathVariable ("idubicacion") Long idubicacion){
        ubicacionService.deleteUbicacionbyId(idubicacion);
    }// DELETE usuario por ID

}