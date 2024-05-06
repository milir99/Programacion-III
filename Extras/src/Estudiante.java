public class Estudiante {
    private String nombre;
    private int edad;
    private double[] calificaciones;
    private int validos;


    public Estudiante() {
        this.nombre = "";
        this.edad = 0;
    }

    public Estudiante(String nombre_p, int edad_p) {
        this.nombre = nombre_p;
        this.edad = edad_p;
        this.calificaciones = new double[10];
        this.validos = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre_p) {
        this.nombre = nombre_p;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad_p) {
        this.edad = edad_p;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones_p) {
        this.calificaciones = calificaciones_p;
    }

    public void agregarCalificacion (double nuevaCalificacion)
    {
        this.calificaciones[validos] = nuevaCalificacion;
        validos++;
    }
    private double obtenerPromedio(double[]calificacionesP)
    {
        double suma=0;

        for(int i=0; i<validos;i++) {
suma= suma+calificacionesP[i];
        }
        double promedio= suma/validos;
        return promedio;
    }
    private String imprimirInformacion (String nombre_p, int edad_p, double calificacionP[])
    {

        return ("Nombre: " + nombre_p + "\n" + "Edad: " + edad_p+ "\n" + "Promedio: " + obtenerPromedio(calificacionP) + "\n");

    }
}
