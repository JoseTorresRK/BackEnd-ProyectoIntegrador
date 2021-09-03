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
}//class resenas controller
