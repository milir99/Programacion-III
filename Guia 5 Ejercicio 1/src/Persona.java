import java.util.Random;
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = " ";
        this.edad = 0;
        this.dni = " ";
        this.genero = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombreP, int edadP, char generoP) {
        this.nombre = nombreP;
        this.edad = edadP;
        this.dni = generarDni();
        this.genero = generoP;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombreP, int edadP, char generoP, double pesoP, double alturaP) {
        this.nombre = nombreP;
        this.edad = edadP;
        this.dni = generarDni();
        this.genero = generoP;
        this.peso = pesoP;
        this.altura = alturaP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreP) {
        this.nombre = nombreP;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edadP) {
        this.edad = edadP;
    }

    public String getDni() {
        return dni;
    }


    public char getGenero() {
        return genero;
    }

    public void setGenero(char generoP) {
        this.genero = generoP;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pesoP) {
        this.peso = pesoP;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double alturaP) {
        this.altura = alturaP;
    }

    public int calcularIMC() {
        double IMC = peso / (altura*altura);
        int resultado;
        if (IMC < 20) {
            resultado = -1;

        } else if (IMC <= 25) {
            resultado = 0;

        } else {
            resultado = 1;
        }
        return resultado;
    }
    public boolean esMayorDeEdad()
    {
        return (edad >18);
    }
    public String AString()
    {
        return "\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\n Dni: "+getDni()+"\nGenero: "+getGenero() +"\nPeso: "+getPeso()+"\nAltura: "+getAltura();
    }
    private String generarDni()
    {
        Random rand = new Random();
        int numeroDni = rand.nextInt(90000000) + 10000000; // Genera un número aleatorio de 8 cifras
        return String.valueOf(numeroDni);
    }


}
