package org.generations.ProyectoTekton.Ubicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/ubicacion/")
public class UbicacionController {
    private final UbicacionService ubicacionService;

    @Autowired
    public UbicacionController ( UbicacionService ubicacionService){
        this.ubicacionService = ubicacionService;
    }
    @GetMapping
    public List<Ubicacion> getUsers() {
        return ubicacionService.getUbicacion();
    }//getUsers
    @GetMapping(path="{ubicacionId}")
    public Ubicacion getUser(@PathVariable("ubicacionId") Long ubicacionId) {
        return ubicacionService.getUbicacionById(ubicacionId);
    }//getUser
    @DeleteMapping(path="{ubicacionId}")
    public void deleteUser(@PathVariable("ubicacionId") Long ubicacionId) {
        ubicacionService.deleteUbicacionById(ubicacionId);
    }//deleteUser
    @PostMapping
    public void addUser(@RequestBody Ubicacion ubic){
        ubicacionService.addUbicacion(ubic);
    }// addUser
    @PutMapping(path="{ubicacionId}")
    public void updateUser (@PathVariable("ubicacionId") Long ubicacionId,
                            @RequestBody Ubicacion ubic) {
        ubicacionService.updateUbicacion(ubicacionId, ubic);
    }//updateUser

}