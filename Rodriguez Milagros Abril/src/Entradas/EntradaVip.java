package Entradas;

import java.util.Objects;

public class EntradaVip extends Entrada{
    private String beneficio;


    public EntradaVip(String beneficio) {
        super();
        this.beneficio = "";
    }

    public EntradaVip(String idP, double precioP, boolean estadoP, String beneficioP) {
        super(idP, precioP, estadoP);
        this.beneficio = beneficioP;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficioP) {
        this.beneficio = beneficioP;
    }

    @Override
    public String toString() {
        return "EntradaVip{" +
                "beneficio=" + beneficio +
                '}';
    }

    public double obtenerPrecioTotal()
    {
         double precioTotal = super.getPrecio()+(super.getPrecio()*0.5);
             super.setPrecio(precioTotal);
             return precioTotal;

    }
    public String obtenerTipo(){

        return "VIP";
    }




}


