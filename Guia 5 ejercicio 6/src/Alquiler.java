import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Alquiler {
    private Vehiculo vehiculo;
    private String cliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private double kilometrosRecorridos;

    public Alquiler(Vehiculo vehiculo, String cliente, Date fechaAlquiler) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
    }

    public void devolver(Date fechaDevolucion, double kilometrosRecorridos) {
        this.fechaDevolucion = fechaDevolucion;
        this.kilometrosRecorridos = kilometrosRecorridos;
        vehiculo.setEstado("en verificación técnica");
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Fecha de alquiler: " + fechaAlquiler;
    }

}

