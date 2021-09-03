package org.generations.ProyectoTekton.Usuarios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Usuarios, Long> {
    @Query("SELECT u FROM Usuarios u WHERE u.email=?1")
    Optional<Usuarios> findUserByName (String username);




}//interface