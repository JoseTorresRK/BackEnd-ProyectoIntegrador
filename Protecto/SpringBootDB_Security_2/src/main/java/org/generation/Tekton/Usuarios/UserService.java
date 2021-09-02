
package org.generation.Tekton.Usuarios;

import org.generation.utils.SHAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }//constructor

    public List<user> getUsers(){
        return userRepository.findAll();
    }// getUsers

    public user getUser(Long userId){
        return userRepository.findById(userId).orElseThrow(
                () -> new IllegalStateException("User does not exists " + userId)
        );
    }// getUser
    public Optional<user> getUser(String nombre,String contrasena){
        Optional<user> usuario=userRepository.findUserByName(nombre);
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

    public void addUser(user usr){

        Optional<user> userByName = userRepository.findUserByName(usr.getNombre());
        if (userByName.isPresent()) {
            throw new IllegalStateException("username exist !!!");
        } //if

        userRepository.save(usr);
    }//addUser
    public void updateImagen(Long userId,String Imagen){
        if(!userRepository.existsById(userId)){
            throw new IllegalStateException("User does not exist " + userId);
        }
        user use=userRepository.getById(userId);
        if(use.getImg_perfil()==Imagen){
            use.setImg_perfil(Imagen);
        }
        userRepository.save(use);
    }
    public void updateDesc(Long userId,String Desc){
        if(!userRepository.existsById(userId)) {
            throw new IllegalStateException("User does not exist " + userId);
        }
        user use= userRepository.getById(userId);
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
       user use=userRepository.getById(userId);
        if(!use.getEmail().equals(contacto)){
            Optional<user> usuario=userRepository.findUserByName(contacto);
            if(usuario.isPresent()){
                throw new IllegalStateException("username exist !!!");
            }
            use.setEmail(contacto);
            use.setTelefono(tel);
        }
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
}//class UserService
