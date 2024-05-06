import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class SistemaAlquiler {
    private List<Vehiculo> vehiculos;
    private List<Alquiler> alquileres;

    public SistemaAlquiler() {
        this.vehiculos = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Alquiler alquilarVehiculo(Vehiculo vehiculo, String cliente, Date fechaAlquiler) {
        if (vehiculo.getEstado().equals("disponible")) {
            vehiculo.setEstado("alquilado");
            Alquiler alquiler = new Alquiler(vehiculo, cliente, fechaAlquiler);
            alquileres.add(alquiler);
            return alquiler;
        } else {
            return null;
        }
    }

    public void establecerResultadoRevision(Alquiler alquiler, String resultado) {
        if (resultado.equals("favorable")) {
            alquiler.getVehiculo().setEstado("disponible");
        } else {
            alquiler.getVehiculo().setEstado("en reparación");
        }
    }

    // Otros métodos para listar el estado de la flota de vehículos, mostrar historial de alquileres, etc.
}
