package org.generation.Tekton.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/users/")
public class userController {

    private final UserService userService;

    @Autowired
    public userController(UserService userService) {
        this.userService = userService;
    }//constructor
    @CrossOrigin("*")
    @GetMapping
    public List<user> getUsers() {
        return userService.getUsers();
    }//getUsers
    @GetMapping(path="{idUsuarios}")
    public user getUser(@PathVariable("idUsuarios") Long userId) {
        return userService.getUser(userId);
    }//getUser
    @GetMapping
    public Optional<user> getUser(@RequestParam String usuario, @RequestParam String contrasena){
        return userService.getUser(usuario,contrasena);
    }
    @PostMapping
    public void addUser(@RequestBody user usr){
        userService.addUser(usr);
    }// addUser
    @PutMapping(path = "{idUsuarios}")
    public void UpdateImagen(@PathVariable("idUsuarios") Long userId,@RequestParam String Imagen){
        userService.updateImagen(userId,Imagen);
    }
    @PutMapping(path = "{idUsuarios}")
    public void UpdateDesc(@PathVariable("idUsuarios") Long userId,@RequestParam String Desc){
        userService.updateDesc(userId,Desc);
    }
    public void UpdateContacto(@PathVariable("idUsuarios") Long userId,@RequestParam String email,@RequestParam String telefono){
        userService.uptadeContacto(userId,email,telefono);
    }
    /*PutMapping(path="{userId}")
    public void updateUser (@PathVariable("userId") Long userId,
                            @RequestParam String imagen) {
        userService.updateImagen(userId, imagen);
    }//updateUser

     */




}//class userController
