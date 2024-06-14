package Biblioteca;

import java.io.Serializable;

abstract public class Material implements Serializable {
    private String titulo;
    private String autor;
    private int anio;
    private int cantEjemplares;
    private boolean disponible;

    public Material() {
        this.titulo = "";
        this.autor = "";
        this.anio = 0;
        this.cantEjemplares = 0;
        this.disponible = false;

    }

    public Material(String tituloP, String autorP, int anioP, int cantEjemplaresP, boolean disponibleP) {
        this.titulo = tituloP;
        this.autor = autorP;
        this.anio = anioP;
        this.cantEjemplares = cantEjemplaresP;
        this.disponible = disponibleP;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Material\n" +
                "titulo='" + titulo + "\n" +
                ", autor='" + autor + "\n" +
                ", anio=" + anio + "\n" +
                ", cantEjemplares=" + cantEjemplares + "\n" +
                ", disponible=" + disponible;
    }
}
