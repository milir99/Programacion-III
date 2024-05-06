package ejercicio3;

public class Personas {

    private String nombre;
 private int edad;
 private char genero; //M mujer ,H hombre.

    public Personas() {
        this.nombre = "";
        this.edad = 0;

    } public Personas(String nombreP, int edadP, char generoP) {
        this.nombre = nombreP;
        this.edad = edadP;
        this.genero = generoP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

}
