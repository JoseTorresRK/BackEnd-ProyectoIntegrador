package org.generations.ProyectoTekton.Resenas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/resenas/")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ResenasController {
    private final ResenasService resenasService;

    public ResenasController(ResenasService resenasService) {
        this.resenasService = resenasService;
    }
	 @GetMapping
    public List<Resena> getResenas() {
        return resenasService.getResenas();
    }//get listaResenas

    @GetMapping(path="{idresenas}")
    public Resena getResenasbyId(@PathVariable("idresenas")Long idResenas) {
        return resenasService.getResenabyId(idResenas);
    }//get ResenasbyId

    // DELETE Resena por ID
    @DeleteMapping( path = "{idresenas}")
    public void deleteResenasbyId(
            @PathVariable ("idresenas") Long idResenas){
        resenasService.deleteResena(idResenas);
    }

    //POST Resenas

    @PostMapping
    public void addResenas(@RequestBody Resena resena){
        resenasService.addResena(resena);
    }

    /*
    // PUT Resena por ID
    @PutMapping( path = "{idresenas}")
    public void updateResenas(@PathVariable("idresenas") Long idResenas,
                               @RequestParam(required=false) String nombreTrabajo,
                               @RequestParam(required=false) String descripcionTrabajo,
                               @RequestParam(required=false) int estrellas){
        resenasService.updateResena(idResenas,nombreTrabajo,descripcionTrabajo,estrellas);
    }
    */
    // PUT Resena por ID
    @PutMapping( path = "{idresenas}")
    public void updateResenas(@PathVariable("idresenas") Long idubic, @RequestBody Resena newresena){
        resenasService.updateResena(idubic,newresena);
    }
}//class resenas controller
