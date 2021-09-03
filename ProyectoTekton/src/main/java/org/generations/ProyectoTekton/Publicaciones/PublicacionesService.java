package org.generations.ProyectoTekton.Publicaciones;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicacionesService {

    private final PublicacionesRepository publicacionesRepository;
    @Autowired
    public PublicacionesService(PublicacionesRepository publicacionesRepository) {
        this.publicacionesRepository = publicacionesRepository;
    }
    public void nuevopost(Publicaciones objnuevopost) {
        Optional<Publicaciones> objpost= publicacionesRepository.findPublicacionesbyId(objnuevopost.getIdpublicaciones());
        System.out.println(objpost);
        if (objpost.isPresent()) {
            throw new IllegalStateException("post ya existe");

        }
        else {
           publicacionesRepository.save(objnuevopost);


        }
    }
    public List<Publicaciones> listaPost(){
        return publicacionesRepository.findAll();
    }
}