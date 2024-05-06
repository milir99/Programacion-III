package modelo;

import modelo.EnvioPorAire;
import modelo.EnvioPorTierra;
import javax.swing.*;
import java.lang.String;

import java.util.ArrayList;

public class GestionDeEnvios {
    private ArrayList<Servicios> listadoPaquetes;
    private float totalDePaquetes;

    public GestionDeEnvios() {
        this.listadoPaquetes = new ArrayList<>();
        this.totalDePaquetes = 0;
    }

    public GestionDeEnvios(ArrayList<Servicios> listadoPaquetes, float totalDePaquetes) {
        this.listadoPaquetes = listadoPaquetes;
        this.totalDePaquetes = totalDePaquetes;
    }

    public ArrayList<Servicios> getListadoPaquetes() {
        return listadoPaquetes;
    }

    public void setListadoPaquetes(ArrayList<Servicios> listadoPaquetesP) {
        this.listadoPaquetes = listadoPaquetesP;
    }

    public float getTotalDePaquetes() {
        return totalDePaquetes;
    }

    public void setTotalDePaquetes(float totalDePaquetesP) {
        this.totalDePaquetes = totalDePaquetesP;
    }

    //Agregar envio
    public void agregarEnvio(Servicios nuevo) {
        listadoPaquetes.add(nuevo);

    }

    public void listado() {
        for (Servicios paquete : listadoPaquetes) {
            System.out.println(paquete + "\nTotal del envio: " + paquete.CalcularTotalPaquete());
        }
    }


    public void mostraEstado() {

        for (Servicios paquete : listadoPaquetes) {

            System.out.println("Estado del paquete con Id " + paquete.getId() + " es " + paquete.getEstado());
        }
    }

    public void cambiarEstadoDeEnvio(String id) {
        for(Servicios paquete:listadoPaquetes) {
            if (paquete.getId().equalsIgnoreCase(id))
            {
                paquete.setEstado("ENVIADO");
            }
        }

    }

    public int cantidadDePaquetes() {
        return listadoPaquetes.size();
    }
}

