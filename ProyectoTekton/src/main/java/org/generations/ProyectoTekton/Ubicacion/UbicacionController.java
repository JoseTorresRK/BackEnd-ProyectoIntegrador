package org.generations.ProyectoTekton.Ubicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/ubicacion")
public class UbicacionController {
    private final UbicacionService ubicacionService;

    @Autowired
    public UbicacionController ( UbicacionService ubicacionService){
        this.ubicacionService = ubicacionService;
    }
    
}