package Biblioteca;

import Excepciones.MaterialNoDisponibleException;
import Interfaz.Prestamo;

import java.io.Serializable;

public class Libro  extends Material implements Prestamo, Serializable {
    int numeroPaginas;

    public Libro() {
        super();
        this.numeroPaginas = 0;
    }

    public Libro(String tituloP, String autorP, int anioP, int cantEjemplaresP, boolean disponibleP, int numeroPaginas) {
        super(tituloP, autorP, anioP, cantEjemplaresP, disponibleP);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }




    @Override
    public String toString() {
        return super.toString() + "\n " +
                "Tipo de material: Libro\n" +
                "numeroPaginas=" + numeroPaginas + "\n"
                ;
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
}
