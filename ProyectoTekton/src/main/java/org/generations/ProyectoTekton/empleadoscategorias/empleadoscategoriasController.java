package org.generations.ProyectoTekton.empleadoscategorias;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/empleadoscategorias")
public class empleadoscategoriasController {
    private final empleadoscategoriasService empleadoscategoriasService;


    public empleadoscategoriasController() {
        empleadoscategoriasService = null;
    }
}
