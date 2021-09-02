package org.generations.ProyectoTekton.Publicaciones;

public class Categoria {
    private String categoria;

    public Categoria(String categoria) {
        this.categoria = categoria;
    }//constructor

    public String getCategoria() {
        return categoria;
    }//getCategoria

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }//setCategoria

    @Override
    public String toString() {
        return categoria;
    }//toString
}
