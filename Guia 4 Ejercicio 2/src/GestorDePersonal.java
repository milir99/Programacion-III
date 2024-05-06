import Empleados.EAsalariado;
import Empleados.EComision;
import Empleados.Empleado;

public class GestorDePersonal {

public  void sueldoMayor(Empleado[] listaEmpleados){
    float mayorSueldo=0;
    Empleado mejorPago= listaEmpleados[0];
    for (Empleado empleado :listaEmpleados)
    {
        float salarioActual = (float) empleado.obtenerSalario(); // Convertimos el salario a float
        if (salarioActual > mayorSueldo) {
            mayorSueldo = salarioActual;
            mejorPago = empleado;
        }
    }
    System.out.println(mejorPago.imprimir());
}
    public void mostrarTodo(Empleado []listaEmpleados){
    for(Empleado empleado: listaEmpleados)
    {
        System.out.println(empleado.imprimir());
        System.out.println();
    }

    }

}
