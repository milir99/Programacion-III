package Empleados;

public abstract  class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;
    private float salario;

    public Empleado() {
        this.dni = "";
        this.nombre = "";
        this.apellido = "";
        this.anioIngreso = 0;
        this.salario=0;
    }

    public Empleado (String dniP, String nombreP, String apellidoP, int anioIngresoP, float salarioP) {
        this.dni = dniP;
        this.nombre = nombreP;
        this.apellido = apellidoP;
        this.anioIngreso = anioIngresoP;
        this.salario =salarioP;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dniP) {
        this.dni = dniP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreP) {
        this.nombre = nombreP;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoP) {
        this.apellido = apellidoP;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngresoP) {
        this.anioIngreso = anioIngresoP;

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String imprimir() {
        return "\nDni: "+ getDni() +"\nEmpleado: "+getNombre() +" "+ getApellido()+"\nAnio de ingreso"+ getAnioIngreso() +"\nSalario: " + String.format("%.2f", getSalario()) ;

    }
    public abstract float obtenerSalario();
}
