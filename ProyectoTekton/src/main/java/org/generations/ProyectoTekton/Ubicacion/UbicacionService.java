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

    public List<Ubicacion> getUbicacion () {return ubicacionRepository.findAll();}

    public Ubicacion getUbicacionById(Long ubicacionId){
        return ubicacionRepository.findById (ubicacionId).orElseThrow(
                () -> new IllegalStateException("Ubicacion does not exists" + ubicacionId)
        );
    }

    public void deleteUbicacionById(Long ubicId) {
        if (ubicacionRepository.existsById(ubicId)) {
            ubicacionRepository.deleteById(ubicId);
        } else {
            throw new IllegalStateException("Ubicacion does not exist " + ubicId);
        }//else
    } // deleteUbicacion

    public void addUbicacion(Ubicacion ubicacion){
        Optional<Ubicacion> ubicacionById = ubicacionRepository.findById(ubicacion.getId_ubicacion());
        if (ubicacionById.isPresent()) {
            throw new IllegalStateException("Ubicacion exist !!!");
        } //if

        ubicacionRepository.save(ubicacion);
    }//addUser

    public void updateUbicacion(Long ubicId, Ubicacion newUbicacion) {
        if (! ubicacionRepository.existsById(ubicId)) {
            throw new IllegalStateException("Ubicacion does not exist " + ubicId);
        }//if ! exists

        Ubicacion ubic = ubicacionRepository.getById(ubicId);
        if (newUbicacion!=null) {
            if (!newUbicacion.getCalle().equals(ubic.getCalle())) ubic.setCalle(newUbicacion.getCalle());
            if (!newUbicacion.getNum_int().equals(ubic.getNum_int())) ubic.setNum_int(newUbicacion.getNum_int());
            if (!newUbicacion.getNum_ext().equals(ubic.getNum_ext())) ubic.setNum_ext(newUbicacion.getNum_ext());
            if (!newUbicacion.getMunicipio().equals(ubic.getMunicipio())) ubic.setMunicipio(newUbicacion.getMunicipio());
            if (!newUbicacion.getCodigo_postal().equals(ubic.getCodigo_postal())) ubic.setCodigo_postal(newUbicacion.getCodigo_postal());
            if (!newUbicacion.getEstado().equals(ubic.getEstado())) ubic.setEstado(newUbicacion.getEstado());
            ubicacionRepository.save(ubic);
        }//if
    }// updateUser
}
