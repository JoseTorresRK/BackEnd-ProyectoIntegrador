package org.generations.ProyectoTekton.Ubicacion;


import org.springframework.data.jpa.repository.JpaRepository;
public interface UbicacionRepository extends JpaRepository <Ubicacion,Long>{
    //@Query("SELECT u FROM Ubicacion u WHERE u.id_ubicacion=?1")
    //Optional<Ubicacion> findUbicacionById (int id_ubicacion);
}
