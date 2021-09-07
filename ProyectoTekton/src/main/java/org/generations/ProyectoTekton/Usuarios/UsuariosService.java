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
        if(!usuario.get().getPwd().equals(contrasena)){
            throw new IllegalStateException("La contraseña no existe " +contrasena);
        }
        return usuario;
    }
    public void updateCategoria(Long userId,String categoria){
        if(!userRepository.existsById(userId)){
            throw new IllegalStateException("User does not exist " + userId);
        }
        Usuarios users=userRepository.getById(userId);
        if(users.getCategoria()!=categoria){
            users.setCategoria(categoria);
            userRepository.save(users);
        }

    }
    public void updateSubcategoria(Long userId,String subcategoria){
        if(!userRepository.existsById(userId)){
            throw new IllegalStateException("User does not exist " + userId);
        }
        Usuarios users=userRepository.getById(userId);
        if(users.getSubcategoria()!=subcategoria){
            users.setSubcategoria(subcategoria);
            userRepository.save(users);
        }

    }
    public void deleteUser(Long userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
        } else {
            throw new IllegalStateException("User does not exist " + userId);
        }//else
    } // deleteUser

    public void addUser(Usuarios usr){

        Optional<Usuarios> userByName = userRepository.findUserByName(usr.getEmail());
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
        if(!use.getImgperfil().equals(Imagen)){
            use.setImgperfil(Imagen);
        }
        userRepository.save(use);
    }
    public void updateDesc(Long userId,String Desc){
        if(!userRepository.existsById(userId)) {
            throw new IllegalStateException("User does not exist " + userId);
        }
        Usuarios use= userRepository.getById(userId);
        if(Desc.length()<=500){

            use.setDescripcionusuario(Desc);
        }else{
            use.setDescripcionusuario(Desc.substring(0,500));
        }
        userRepository.save(use);

    }

    public void uptadeContacto(Long userId,String contacto,String tel){
        if(!userRepository.existsById(userId)) {
            throw new IllegalStateException("User does not exist " + userId);
        }
        Usuarios use=userRepository.getById(userId);

        Optional<Usuarios> usuario=userRepository.findUserByName(contacto);
        if(usuario.isPresent()){
            if(usuario.get().getIdusuarios()==use.getIdusuarios()){
                use.setTelefono(tel);
            }
            else {
                throw new IllegalStateException("username exist !!!");
            }

        }
        use.setEmail(contacto);
        use.setTelefono(tel);
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
