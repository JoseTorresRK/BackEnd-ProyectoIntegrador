package org.generations.ProyectoTekton.Resenas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ResenasService {
    public final ArrayList<Resena> lista = new ArrayList<>();
    
    private final ResenaRepository resenaRepository;
    
    @Autowired
    public ResenasService (ResenaRepository resenaRepository){
        this.resenaRepository = resenaRepository;
    }
    /*
    public ResenasService() {
        lista.add(new Resena(1L, "Plomeria",
                "buen trabajo, muy limpio y rapido", 5));
        lista.add(new Resena(2L, "Plomeria",
                "buen trabajo, muy limpio y rapido", 5));
        lista.add(new Resena(3L, "Herreria",
                "excelente trabajo lo recomiendo totalmente", 5));
        lista.add(new Resena(4L, "Plomeria",
                "buen trabajo, muy limpio y rapido", 5));
    }//constructor
     */
    public List<Resena> getResenas() {
        return resenaRepository.findAll();
    }//GetAll
    
    public Resena getResenabyId(Long idResena) {
        return resenaRepository.findById (idResena).orElseThrow(
                () -> new IllegalStateException("Resena does not exists" + idResena)
        );
    }//GetbyId
    
    
    public void deleteResena(Long idResena) {
        if (resenaRepository.existsById(idResena)) {
            resenaRepository.deleteById(idResena);
        } else {
            throw new IllegalStateException("Resena does not exist " + idResena);
        }//else

    }//deleteById
    
    public void addResena(Resena Resena) {
        Optional<Resena> resenaById = resenaRepository.findById(Resena.getId_resena());
        if (resenaById.isPresent()) {
            throw new IllegalStateException("Resena exist !!!");
        } //if

        resenaRepository.save(Resena);
    } //addResena
    
    
    public void updateResena(Long idResena, Resena newresena) {
        if (! resenaRepository.existsById(idResena)) {
            throw new IllegalStateException("Ubicacion does not exist " + idResena);
        }//if ! exists
        Resena tempresena = resenaRepository.getById(idResena);
        if (newresena!=null) {
            if (!newresena.getNombre_trabajo().equals(tempresena.getNombre_trabajo())) tempresena.setNombre_trabajo(newresena.getNombre_trabajo());
            if (!newresena.getDescripcion().equals(tempresena.getDescripcion())) tempresena.setDescripcion(newresena.getDescripcion());
            if (newresena.getEstrellas() != tempresena.getEstrellas()) tempresena.setEstrellas(newresena.getEstrellas());

            resenaRepository.save(tempresena);
        }//if
    }
}

