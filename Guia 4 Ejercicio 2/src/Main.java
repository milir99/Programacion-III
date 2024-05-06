import Empleados.EAsalariado;
import Empleados.EComision;
import Empleados.Empleado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado [] listaEmpleados = new Empleado[4] ;
        listaEmpleados[0] = new EAsalariado("569587A", "Javier", "Gómez", 2008,0, 1225.00f);
        listaEmpleados[1] = new EComision("695235B", "Eva", "Nieto", 2010,0, 179, 8.10f,750);

        // Crear listaEmpleados restantes utilizando constructor vacío y setters
        listaEmpleados[2] = new EComision();
        listaEmpleados[2].setDni("741258C");
        listaEmpleados[2].setNombre("José");
        listaEmpleados[2].setApellido("Ruiz");
        listaEmpleados[2].setAnioIngreso(2012);
        ((EComision) listaEmpleados[2]).setClientes(81); // Cast a EComision para llamar a setClientesCaptados
        ((EComision) listaEmpleados[2]).setMontoPorCliente(7.90f);
        ((EComision) listaEmpleados[2]).setSalarioMinimo(750);

        listaEmpleados[3] = new EAsalariado();
        listaEmpleados[3].setDni("896325D");
        listaEmpleados[3].setNombre("María");
        listaEmpleados[3].setApellido("Núñez");
        listaEmpleados[3].setAnioIngreso(2013);
        ((EAsalariado) listaEmpleados[3]).setSalarioBase (1155.00f);


        GestorDePersonal gestorDePersonal = new GestorDePersonal();

        // Llamar a los métodos de la clase GestorPersonal
        System.out.println("El empleado con mayor sueldo es:");
        gestorDePersonal.sueldoMayor(listaEmpleados);
        System.out.println();
        System.out.println("La lista de empleados es: ");
        gestorDePersonal.mostrarTodo(listaEmpleados);

    }
}