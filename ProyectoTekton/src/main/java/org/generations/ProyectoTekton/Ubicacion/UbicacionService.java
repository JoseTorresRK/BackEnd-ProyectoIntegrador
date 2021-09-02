package org.generations.ProyectoTekton.Ubicacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class UbicacionService {
    public final ArrayList<Ubicacion> lista = new ArrayList<Ubicacion>();
    private final UbicacionRepository ubicacionRepository;

    @Autowired
    //Constructor
    public UbicacionService( UbicacionRepository ubicacionRepository){
        this.ubicacionRepository = ubicacionRepository;
    }

    public List<Ubicacion> getUbicacion () {return ubicacionRepository.findAll();}

    public void addUbicacion(Ubicacion objUbicacion){
       Optional<Ubicacion> ubicaciondyId = ubicacionRepository.findById(objUbicacion.getIdubicacion());
        if(ubicaciondyId.isPresent()){
            throw new IllegalStateException("Ubicacion ya existente");
        }else{
            ubicacionRepository.save(objUbicacion);
        }
    }

    public Ubicacion getUbicacionbyId(Long idubicacion){

            return ubicacionRepository.findById(idubicacion).orElseThrow(
                    () -> new IllegalStateException("Ubicacion does not exists" + idubicacion));

    }


    public void deleteUbicacionbyId(Long idubicacion){
        if(ubicacionRepository.existsById(idubicacion)){
            ubicacionRepository.deleteById(idubicacion);
        }else{
            throw new IllegalStateException("Ubicacion doesn't exists"+ idubicacion);
        }
    }// deleteUbicacionbyId

    public void updateUbicacion(Long ubicId, Ubicacion newUbicacion) {
        if (!ubicacionRepository.existsById(ubicId)) {
            throw new IllegalStateException("Ubicacion does not exist " + ubicId);
        }//if ! exists
        Ubicacion temporalUbicacion = ubicacionRepository.getById(ubicId);
        if(newUbicacion != null){
            if(!newUbicacion.getEstado().equals(temporalUbicacion.getEstado())){
                temporalUbicacion.setEstado(newUbicacion.getEstado());
            }
            if(!newUbicacion.getMunicipio().equals(temporalUbicacion.getMunicipio())){
                temporalUbicacion.setMunicipio(newUbicacion.getMunicipio());
            }
            if(!newUbicacion.getCalle().equals(temporalUbicacion.getCalle())){
                temporalUbicacion.setCalle(newUbicacion.getCalle());
            }
            if(!newUbicacion.getCodigopostal().equals(temporalUbicacion.getCodigopostal())){
                temporalUbicacion.setCodigopostal(newUbicacion.getCodigopostal());
            }
            if(!newUbicacion.getNumeroext().equals(temporalUbicacion.getNumeroext())){
                temporalUbicacion.setNumeroext(newUbicacion.getNumeroint());
            }
            if(!newUbicacion.getNumeroint().equals(temporalUbicacion.getNumeroint())){
                temporalUbicacion.setNumeroint(newUbicacion.getNumeroint());
            }
            if(newUbicacion.getLatitud() != temporalUbicacion.getLatitud()){
                temporalUbicacion.setLatitud(newUbicacion.getLatitud());
            }
            if(newUbicacion.getLongitud() != temporalUbicacion.getLongitud()){
                temporalUbicacion.setLongitud(newUbicacion.getLongitud());
            }
        }
    }
}
