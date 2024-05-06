public class Cliente {
    private String id;
    private String nombre;
    private char genero;

    public Cliente() {
        this.id = "";
        this.nombre = "";
        this.genero = '-';
    }
    public Cliente(String idP, String nombreP, char generoP) {
        this.id = idP;
        this.nombre = nombreP;
        this.genero = generoP;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }
    public String imprimirCliente()
    {

        return "ID: "+ getId() +"\nCliente: " + getNombre()+"\nGenero: "+ getGenero()+"\n";
    }
}
