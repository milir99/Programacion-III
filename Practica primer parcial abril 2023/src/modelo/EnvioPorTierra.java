package modelo;

import javax.swing.*;
import java.util.Objects;

public class EnvioPorTierra extends Servicios {
    private float distancia;//En km
    private String vehiculo; // camion,auto,moto,bicicleta
    private float kilometrosBase = 100;

    public EnvioPorTierra(String idP, float pesoP, String destinoP, boolean seguroP, boolean entregaDiaP, float distanciaP, String vehiculoP) {
        super(idP, pesoP, destinoP, seguroP, entregaDiaP);
        distancia = distanciaP;
        vehiculo = vehiculoP;
    }

    public EnvioPorTierra() {
        distancia = 0;
        vehiculo = "";
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distanciaP) {
        this.distancia = distanciaP;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculoP) {
        this.vehiculo = vehiculoP;
    }


    public void setKilometrosBase(float kilometrosBase) {
        this.kilometrosBase = kilometrosBase;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDistancis: " + distancia + "\nVehiculo: " + vehiculo;
    }

    public float calcularTarifaEnvio() {
        float total = getPeso() * 25; // Calcula el costo base por el peso del paquete

        // Verifica si el tipo de vehículo es un camión (ten en cuenta la comparación de cadenas con equals())
        if (vehiculo.equalsIgnoreCase("CAMION")) {
            total += total * 0.1; // Aplica un aumento del 10% si es un camión
        }
        // Calcula los kilómetros extras sobre la distancia base de 100 km
        float kilometrosExtra = distancia - 100;
        // Verifica si hay kilómetros extras
        if (kilometrosExtra > 0) {
            // Calcula el costo adicional por cada kilómetro extra
            total += kilometrosExtra * (25 * 0.05);
        }

        return total;
    }

    public float calcularCostoAdicional() {
        float seguro = 1500;
        double entregaDia = 0.25;
        float total = calcularTarifaEnvio();
        if (super.isSeguro()) {
            total += seguro;
        }
        if (isEntregaDia()) {
            total += total * entregaDia;
        }

        return total;
    }

    @Override
    public float CalcularTotalPaquete() {
        return calcularCostoAdicional() + calcularTarifaEnvio();
    }

    @Override
    public boolean equals(Object o) {
        boolean rsp = false;
        if(o !=null && o instanceof EnvioPorTierra)
        {
            if(this=o)
            {
                rsp =true
            }else{
                EnvioPorTierra aux = (EnvioPorTierra) o;
                if((aux.getDestino().equals(getDestino())) && (aux.getPeso() == getPeso())&&()){
                    rsp = true;
                }
            }
        }
    }



}
