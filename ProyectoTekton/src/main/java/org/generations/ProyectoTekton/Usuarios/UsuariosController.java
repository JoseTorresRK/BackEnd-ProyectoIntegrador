package org.generations.ProyectoTekton.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "api/users/")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class UsuariosController {

    private final UsuariosService userService;

    @Autowired
    public UsuariosController(UsuariosService userService) {
        this.userService = userService;
    }//constructor

    @GetMapping
    public List<Usuarios> getUsarios() {
        return userService.getUsers();
    }//getUsers
    @GetMapping(path="{idusuarios}")
    public Usuarios getUser(@PathVariable("idusuarios") Long userId) {
        return userService.getUser(userId);
    }//getUser
    @GetMapping(path = "/login/")
    public Optional<Usuarios> getUser(@RequestParam String usuario, @RequestParam String contrasena){
        return userService.getUser(usuario,contrasena);
    }
    @PostMapping
    public void addUser(@RequestBody Usuarios usr){
        userService.addUser(usr);
    }// addUser
    @PutMapping(path = "/Imag/{idusuarios}")
    public void UpdateImagen(@PathVariable("idusuarios") Long userId,@RequestParam String Imagen){
        userService.updateImagen(userId,Imagen);
    }
    @PutMapping(path = "/Desc/{idusuarios}")
    public void UpdateDesc(@PathVariable("idusuarios") Long userId,@RequestParam String Desc){
        userService.updateDesc(userId,Desc);
    }
    @PutMapping(path = "/contacto/{idusuarios}")
    public void UpdateContacto(@PathVariable("idusuarios") Long userId,@RequestParam String email,@RequestParam String telefono){
        userService.uptadeContacto(userId,email,telefono);
    }


}
