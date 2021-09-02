package org.generations.ProyectoTekton.Usuarios;

//import org.generation.utils.SHAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuariosService {
    private final UserRepository userRepository;

    @Autowired
    public UsuariosService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }//constructor

    public List<Usuarios> getUsers(){
        return userRepository.findAll();
    }// getUsers

    public Usuarios getUser(Long userId){
        return userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException("User does not exists " + userId)
        );
    }// getUser
    public Optional<Usuarios> getUser(String nombre, String contrasena){
        Optional<Usuarios> usuario=userRepository.findUserByName(nombre);
        if(!usuario.isPresent()){
            throw new IllegalStateException("User does not exist " +nombre);
        }
        return usuario;
    }

    public void deleteUser(Long userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
        } else {
            throw new IllegalStateException("User does not exist " + userId);
        }//else
    } // deleteUser

    public void addUser(Usuarios usr){

        Optional<Usuarios> userByName = userRepository.findUserByName(usr.getNombre());
        if (userByName.isPresent()) {
            throw new IllegalStateException("username exist !!!");
        } //if

        userRepository.save(usr);
    }//addUser
    public void updateImagen(Long userId,String Imagen){
        if(!userRepository.existsById(userId)){
            throw new IllegalStateException("User does not exist " + userId);
        }
        Usuarios use=userRepository.getById(userId);
        if(!use.getImg_perfil().equals(Imagen)){
            use.setImg_perfil(Imagen);
        }
        userRepository.save(use);
    }
    public void updateDesc(Long userId,String Desc){
        if(!userRepository.existsById(userId)) {
            throw new IllegalStateException("User does not exist " + userId);
        }
        Usuarios use= userRepository.getById(userId);
        if(Desc.length()<=500){

            use.setDescripcion_usuario(Desc);
        }else{
            use.setDescripcion_usuario(Desc.substring(0,500));
        }
        userRepository.save(use);

    }

    public void uptadeContacto(Long userId,String contacto,String tel){
        if(!userRepository.existsById(userId)) {
            throw new IllegalStateException("User does not exist " + userId);
        }
        Usuarios use=userRepository.getById(userId);
        if(!use.getEmail().equals(contacto)){
            Optional<Usuarios> usuario=userRepository.findUserByName(contacto);
            if(usuario.isPresent()){
                throw new IllegalStateException("username exist !!!");
            }
            use.setEmail(contacto);
            use.setTelefono(tel);
        }
        userRepository.save(use);
    }

  /*  public void updateUser(Long userId, String oldPassword, String newPassword) {
        if (! userRepository.existsById(userId)) {
           throw new IllegalStateException("User does not exist " + userId);
        }//if ! exists
        user usr = userRepository.getById(userId);
        if (! SHAUtil.verifyHash(oldPassword, usr.getPassword()) ){
        //if (! usr.getPassword().equals(oldPassword)) {
            throw new IllegalStateException("Password does not match " + userId);
        }//if ! exists
       if (newPassword!=null && newPassword.length()>=4 &&
               (! SHAUtil.verifyHash(newPassword, usr.getPassword())) ) {
                //(! usr.getPassword().equals(newPassword)) ) {
                usr.setPassword(newPassword);
           userRepository.save(usr);
        }//if
    }// updateUser
*/
}
