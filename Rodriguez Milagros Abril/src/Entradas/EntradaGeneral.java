package Entradas;

public class EntradaGeneral extends Entrada {

public String zona;


    public EntradaGeneral() {
        super();
        this.zona = "";
    }

    public EntradaGeneral(String idP, double precioP, boolean estadoP, String zonaP) {
        super(idP, precioP, estadoP);
        this.zona = zonaP;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zonaP) {
        this.zona = zona;
    }

    public double obtenerPrecioTotal()
    {
        double precioTotal = super.getPrecio();
        return precioTotal;

    }
    public String obtenerTipo(){

        return "General";
    }
}
