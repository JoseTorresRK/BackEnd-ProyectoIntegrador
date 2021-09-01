package org.generations.ProyectoTekton.Ubicacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class UbicacionService {
    public final ArrayList<Ubicacion> lista = new ArrayList<Ubicacion>();

    @Autowired
    //Constructor
    public UbicacionService( UbicacionRepository ubicacionRepository){
        this.ubicacionRepository = ubicacionRepository;
    }
    public List<Ubicacion> getUbicacion () {return ubicacionRepository.findAll();}

    public Ubicacion getUbicacionById(int ubicacionId){
        return ubicacionRepository.findById (ubicacionId).orElseTrow(
                () -> new IllegalStateException("Ubicacion does not exists" + ubicacionId)
        );
    }

}
