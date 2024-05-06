package Entradas;


import java.util.Objects;

abstract public class Entrada {
    private String id;
    private double precio;
    private boolean estado;// true= vendida falso= disponible

    public Entrada() {
        this.id = "";
        this.precio = 0;
        this.estado = false;
    }
    public Entrada(String idP, double precioP, boolean estadoP) {
        this.id = idP;
        this.precio = precioP;
        this.estado = estadoP;
    }

    public String getId() {
        return id;
    }

    public void setId(String idP) {
        this.id = idP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precioP) {
        this.precio = precioP;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estadoP) {
        this.estado = estadoP;
    }

    @Override
    public String toString() {
        return "Entradas{" +
                "id= " + id +
                ", precio= " + precio +
                ", estado= " + estado +
                '}';
    }

    abstract  public String obtenerTipo();

    abstract public double obtenerPrecioTotal();


}
