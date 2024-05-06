package Empleados;

public class EComision extends Empleado {
    private int clientes;
    private float montoPorCliente;
    private float salarioMinimo;

    public EComision() {
        super();
        this.clientes = 0;
        this.montoPorCliente = 0;
        this.salarioMinimo = 0;
    }

    public EComision(String dniP, String nombreP,String apellidoP,int anioIngresoP,float salarioP,int clientesP, float montoPorClienteP, float salarioMinimoP) {
        super(dniP,nombreP,apellidoP,anioIngresoP,salarioP);
        this.clientes = clientesP;
        this.montoPorCliente = montoPorClienteP;
        this.salarioMinimo = salarioMinimoP;
    }

    public int getClientes() {
        return clientes;
    }

    public void setClientes(int clientesP) {
        this.clientes = clientesP;
    }

    public float getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(float montoPorClienteP) {
        this.montoPorCliente = montoPorClienteP;
    }

    public float getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(float salarioMinimoP) {
        this.salarioMinimo = salarioMinimoP;
    }
//Calculo de salario en el caso de que el salario haciendo cliente por monto sea menor que un salario minimo se le pagara el salario minimo
    public float obtenerSalario() {
        float salario= montoPorCliente * clientes;
        if (salario < salarioMinimo)
        {
            salario = salarioMinimo;
        }
        setSalario(salario);
        return  salario;
}

}
