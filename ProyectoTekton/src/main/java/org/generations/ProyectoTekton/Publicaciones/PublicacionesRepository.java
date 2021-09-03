package org.generations.ProyectoTekton.Publicaciones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PublicacionesRepository extends JpaRepository<Publicaciones, Long> {
    @Query("SELECT p FROM Publicaciones p WHERE p.idpublicaciones=?1")
    Optional<Publicaciones> findPublicacionesbyId(Long Publicaciones );

}
