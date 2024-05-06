package ejercicio1;

public class saludobienvanida
{
    private String nombre;
    private int edad;

    public saludobienvanida(String nombreParam, int edadParam) {
        this.nombre = nombreParam;
        this.edad = edadParam;
    }

    public saludobienvanida(String nombreParam) {
        this.nombre = nombreParam;
    }

    public saludobienvanida(int edadParam) {
        this.edad = edadParam;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
