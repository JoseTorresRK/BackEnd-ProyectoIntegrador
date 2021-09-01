package org.generations.ProyectoTekton.Usuarios;

public class Subcategoria {
    private String subcategoria;

    public Subcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }//constructor

    public String getSubcategoria() {
        return subcategoria;
    }//getSubcategoria

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }//setSubcategoria

    @Override
    public String toString() {
        return subcategoria;
    }//toString()
}
