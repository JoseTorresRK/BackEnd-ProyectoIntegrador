package org.generations.ProyectoTekton.Resenas;

import org.generations.ProyectoTekton.Usuarios.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="api/resenas")
public class ResenasController {
    private final ResenasService resenasService;

    @Autowired
    public ResenasController(ResenasService resenasService) {
        this.resenasService= resenasService;
    }
    @GetMapping
    public List<Resena> getResenas() {
        return resenasService.getResenas();
    }//get listaResenas
    @GetMapping(path="{idResenas}")
    public Resena getResenasbyId(@PathVariable("idResenas")Long idResenas) {
        return resenasService.getResenabyId(idResenas);
    }//get ResenasbyId

    // DELETE Resena por ID
    @DeleteMapping( path = "{idResenas}")
    public void deleteResenasbyId(
            @PathVariable ("idResenas") Long idResenas){
        resenasService.deleteResena(idResenas);
    }

    //POST Resenas

    @PostMapping
    public void addResenas(@RequestBody Resena resena){
        resenasService.addResena(resena);
    }

    // PUT Resena por ID
    @PutMapping( path = "{idResenas}")
    public void updateResenas(@PathVariable("idResenas") Long idResenas,
                               @RequestParam(required=false) String nombreTrabajo,
                               @RequestParam(required=false) String descripcionTrabajo,
                               @RequestParam(required=false) int estrellas){
        resenasService.updateResena(idResenas,nombreTrabajo,descripcionTrabajo,estrellas);
    }

}//class resenas controller
