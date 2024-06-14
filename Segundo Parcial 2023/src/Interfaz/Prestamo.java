package Interfaz;

import Biblioteca.Libro;
import Biblioteca.Material;
import Biblioteca.Revista;
import Excepciones.MaterialNoDisponibleException;

public interface Prestamo <E extends Material> {
    public boolean prestar(E material)throws MaterialNoDisponibleException;
    public void devolver (E material);
}
