package org.generations.ProyectoTekton.Ubicacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UbicacionService {
    public final ArrayList<Ubicacion> lista = new ArrayList<Ubicacion>();
    private final UbicacionRepository ubicacionRepository;

    @Autowired
    //Constructor
    public UbicacionService( UbicacionRepository ubicacionRepository){
        this.ubicacionRepository = ubicacionRepository;
    }

    public void addUbicacion(Ubicacion objUbicacion){
        Optional<Ubicacion> nombreUbicacion =
                ubicacionRepository.findUbicacionByCalle( objUbicacion.getCalle());
        if(nombreUbicacion.isPresent()){
            System.out.println("Ya existe calle");
        }else{
            System.out.println("Se puede agregar calle");
        }
    }

    public Ubicacion getUbicacion(Long idubicacion){
        if(ubicacionRepository.existsById(idubicacion)){
            return ubicacionRepository.findById(idubicacion);
        }
    }


    public void deleteUbicacionbyId(Long idubicacion){
        if(idubicacion<=lista.size()){
            lista.remove(idubicacion.intValue()-1);
        }
    }// deleteUbicacionbyId



}
