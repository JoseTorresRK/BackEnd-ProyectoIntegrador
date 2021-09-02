package org.generations.ProyectoTekton.Resenas;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ResenasService {
    public final ArrayList<Resena> lista = new ArrayList<>();

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

    public ArrayList<Resena> getResenas() {
        return lista;
    }//getter
    public Resena getResenabyId(Long idResena) {
        return lista.get(idResena.intValue()-1);
    }//return
    public void deleteResena(Long idResena) {
        if(idResena<=lista.size()) {
            lista.remove(idResena.intValue()-1);
        }//if

    }//delete
    public void addResena(Resena Resena) {
        lista.add(Resena);
    } //addResena
    public void updateResena(Long idResena, String nombreTrabajo, String descripcionTrabajo,
                             int estrellas) {
        if (idResena<=lista.size()) {
            Resena tempResena= lista.get(idResena.intValue()-1);
            if (nombreTrabajo != null) tempResena.setNombre_trabajo(nombreTrabajo);
            if (descripcionTrabajo != null) tempResena.setDescripcion(descripcionTrabajo);
            if (estrellas>0) tempResena.setEstrellas(estrellas);

        }
    }
}

