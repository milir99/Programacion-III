package ejercicio2;

public class Productos {
    private String Nombre;
    private double Precio;
    private  int  Cantidad;


    public Productos(String nombreP, double precioP, int cantidadP) {
        Nombre = nombreP;
        Precio = precioP;
        Cantidad = cantidadP;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombreP) {
        Nombre = nombreP;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precioP) {
        Precio = precioP;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidadP) {
        Cantidad = cantidadP;
    }
}
