package org.generations.ProyectoTekton.Ubicacion;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
public interface UbicacionRepository extends JpaRepository <Ubicacion,String>{
    @Query("SELECT u FROM Ubicacion u WHERE u.id_ubicacion=?1")
    Optional<Ubicacion> findUbicacionById (int id_ubicacion);
}
