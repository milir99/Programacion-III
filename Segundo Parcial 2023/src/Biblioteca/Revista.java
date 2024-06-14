package Biblioteca;

import Excepciones.MaterialNoDisponibleException;
import Interfaz.Prestamo;

import java.io.Serializable;

public class Revista extends Material implements Prestamo, Serializable {
    int numeroEdicion;
    boolean suscripcion;

    public Revista() {
        super();
        this.numeroEdicion = 0;
        this.suscripcion =false;
    }

    public Revista(String tituloP, String autorP, int anioP, int cantEjemplaresP, boolean disponibleP, int numeroEdicionP, boolean suscripcionP) {
        super(tituloP, autorP, anioP, cantEjemplaresP, disponibleP);
        this.numeroEdicion = numeroEdicionP;
        this.suscripcion = suscripcionP;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicionP) {
        this.numeroEdicion = numeroEdicionP;
    }

    public boolean isSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(boolean suscripcionP) {
        this.suscripcion = suscripcionP;
    }
    @Override
    public boolean prestar(Material material)throws MaterialNoDisponibleException {
        boolean flag = false;
        if(!isDisponible()){
            throw new MaterialNoDisponibleException("El Libro que intenta prestar No se encuentra disponible");
        }
        else  {

            setCantEjemplares(getCantEjemplares()-1);
            if(getCantEjemplares()==0)
            {
                setDisponible(false);
            }
            return flag;
        }

    }
    @Override
    public void  devolver(Material material) {
        setCantEjemplares(getCantEjemplares()-1);
        if(!isDisponible())
        {
            setDisponible(true);
        }

    }
    @Override
    public String toString() {
        return super.toString()+"\n "+
                "Tipo de material:Revista\n" +
                "numeroEdicion=" + numeroEdicion +
                "\nsuscripcion=" + suscripcion +"\n";
    }
}
