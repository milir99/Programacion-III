
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un sistema de alquiler
        SistemaAlquiler sistemaAlquiler = new SistemaAlquiler();

        // Agregar algunos vehículos
        Vehiculo auto1 = new Automovil("ABC123", "Toyota", "Corolla", 2020, 50000, 50.0, "disponible");
        Vehiculo utilitario1 = new Utilitario("XYZ456", "Ford", "Transit", 2018, 80000, 70.0, "disponible", "carga liviana");

        sistemaAlquiler.agregarVehiculo(auto1);
        sistemaAlquiler.agregarVehiculo(utilitario1);

        // Alquilar un vehículo
        Alquiler alquiler1 = sistemaAlquiler.alquilarVehiculo(auto1, "Juan Perez", new Date());
        if (alquiler1 != null) {
            System.out.println("Se ha alquilado el vehículo: " + alquiler1.getVehiculo());
        } else {
            System.out.println("El vehículo no está disponible para alquiler.");
        }

        // Devolver el vehículo alquilado
        alquiler1.devolver(new Date(), 50500);
        sistemaAlquiler.establecerResultadoRevision(alquiler1, "favorable");

        // Mostrar el estado de la flota de vehículos
        System.out.println("\nEstado de la flota de vehículos:");
        for (Vehiculo vehiculo : sistemaAlquiler.getVehiculos()) {
            System.out.println(vehiculo);
        }

        // Mostrar historial de alquileres
        System.out.println("\nHistorial de alquileres:");
        for (Alquiler alquiler : sistemaAlquiler.getAlquileres()) {
            System.out.println("Cliente: " + alquiler.getCliente() + ", Fecha de alquiler: " + alquiler.getFechaAlquiler());
        }
    }
}