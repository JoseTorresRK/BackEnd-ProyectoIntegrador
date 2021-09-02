package org.generations.ProyectoTekton.Ubicacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {
    @Query("SELECT c FROM ubicacion WHERE c.calle=?1")
    Optional<Ubicacion> findUbicacionByCalle(String calle);

}
