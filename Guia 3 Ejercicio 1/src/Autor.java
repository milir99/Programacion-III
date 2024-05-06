public class Autor {
    String nombre;
    String apellido;
    String email;
    char genero;// M O F
    public Autor() {
        this.nombre = "";
        this.apellido = "";
        this.email = "";
        this.genero = '-' ;
    }
    public Autor(String nombreP, String apellidoP, String emailP, char generoP) {
        this.nombre = nombreP;
        this.apellido = apellidoP;
        this.email = emailP;
        this.genero = generoP;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }
    //Metodo
    public String imprimirAutor()
    {
        return  "Autor: "+getApellido() +" "+ getNombre() +" Email: "+ getEmail()+ "  Genero: "+ getGenero();
    }
}
