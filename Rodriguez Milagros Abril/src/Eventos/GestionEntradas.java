package Eventos;

import Entradas.Entrada;

import java.security.SecureRandom;

public interface GestionEntradas {
    public String cargarEntrada(Entrada nueva);
    public int EntradasPorTipoVendidas(String tipo);
    public String entradasDisponibles();
    public String venderEntrada(String tipo);
    public double totalRecaudado();

}
