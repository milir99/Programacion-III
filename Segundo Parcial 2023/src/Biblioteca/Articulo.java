package Biblioteca;

import java.io.Serializable;

public class Articulo extends Material implements Serializable {
    String resumen;

    public Articulo(String tituloP, String autorP, int anioP, int cantEjemplaresP, boolean disponibleP, String resumenP) {
        super(tituloP, autorP, anioP, cantEjemplaresP, disponibleP);
        this.resumen = resumenP;
    }

    public Articulo() {
        super();
        this.resumen = "";
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumenP) {
        this.resumen = resumenP;
    }

    @Override
    public String toString() {
        return super.toString()+"\n "+
                "Tipo de material: Articulo\n" +
                "resumen=" + resumen  +
                "\n";
    }
}
