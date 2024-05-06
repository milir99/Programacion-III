package Empleados;

public class EAsalariado extends Empleado {
    private float salarioBase;

    public EAsalariado() {
        super();
        this.salarioBase = 0;
    }

    public EAsalariado(String dniP, String nombreP, String apellidoP, int anioIngresoP, float salarioP, float salarioBaseP) {
        super(dniP, nombreP, apellidoP, anioIngresoP, salarioP);
        this.salarioBase = salarioBaseP;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBaseP) {
        this.salarioBase = salarioBaseP;
    }

    public float obtenerSalario() {
        int añosTrabajados = 2024 - getAnioIngreso();
        float salario = 0;

        if (añosTrabajados < 2) {
            salario = salarioBase;
        } else if (añosTrabajados <= 3) {
            salario = salarioBase * 1.052f;
        } else if (añosTrabajados <= 7) {
            salario = salarioBase * 1.102f;
        } else if (añosTrabajados <= 15) {
            salario = salarioBase * 1.152f;
        } else {
            salario = salarioBase * 1.202f;
        }

        setSalario(salario);
        return salario;
    }
}


