import java.util.ArrayList;
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;
    private double precioAlquiler;
    private String estado;
    private ArrayList<SistemaAlquiler> listaAlquileres;


    public Vehiculo() {
        this.patente = "";
        this.marca ="";
        this.modelo = "";
        this.anio = 0;
        this.kilometraje =0;
        this.precioAlquiler = 0;
        this.estado ="";
    }
    public Vehiculo(String patenteP, String marcaP, String modeloP, int anioP, double kilometrajeP, double precioAlquilerP, String estadoP) {
        this.patente = patenteP;
        this.marca = marcaP;
        this.modelo = modeloP;
        this.anio = anioP;
        this.kilometraje = kilometrajeP;
        this.precioAlquiler = precioAlquilerP;
        this.estado = estadoP;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patenteP) {
        this.patente = patenteP;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marcaP) {
        this.marca = marcaP;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modeloP) {
        this.modelo = modeloP;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anioP) {
        this.anio = anioP;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometrajeP) {
        this.kilometraje = kilometrajeP;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquilerP) {
        this.precioAlquiler = precioAlquilerP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadoP) {
        this.estado = estadoP;
    }


    @Override
    public String toString() {
        return marca + " " + modelo + " (" + anio + ") - Patente: " + patente + ", Estado: " + estado;
    }

}
