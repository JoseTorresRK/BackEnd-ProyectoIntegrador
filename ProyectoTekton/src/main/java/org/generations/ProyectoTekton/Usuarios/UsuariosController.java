package org.generations.ProyectoTekton.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/usuarios")
public class UsuariosController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuariosController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    // Get lista usuarios
    @GetMapping
    public List<Usuarios> getUsuarios() {return usuarioService.getUsuarios();}

    // Get Usuario por ID
    @GetMapping( path = "{usuariosId}")
    public Usuarios getUsuariosbyId(@PathVariable ("usuariosId") Long usuariosId){
        return usuarioService.getUsuariosbyId(usuariosId);
    }

    // DELETE usuario por ID
    @DeleteMapping( path = "{usuariosId}")
    public void deleteUsuariobyId(
            @PathVariable ("usuariosId") Long usuariosId){
        usuarioService.deleteUsuarios(usuariosId);
    }

    //POST usuario

    @PostMapping
    public void addUsuarios(@RequestBody Usuarios usuario){
        usuarioService.addUsuarios(usuario);
    }

    // PUT usuario por ID
    @PutMapping( path = "{usuariosId}")
    public void updateUsuarios(@PathVariable("usuariosId") Long usuariosId,
                               @RequestParam(required=false) String nombre,
                               @RequestParam(required=false) int tipo,
                               @RequestParam(required=false) int estrellas,
                               @RequestParam(required=false) String descripcion_usuario,
                               @RequestParam(required=false) String img_perfil,
                               @RequestParam(required=false) String email){
        usuarioService.updateUsuarios(usuariosId,nombre,tipo,estrellas,descripcion_usuario,img_perfil,email);
    }

}//Usuarios Controller
