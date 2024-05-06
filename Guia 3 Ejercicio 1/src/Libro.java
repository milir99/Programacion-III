public class Libro {
    String titulo;
    float  precio;
    int stock;
    Autor autor;
//Constructores
    public Libro() {
        this.titulo = " ";
        this.precio = 0;
        this.stock = 0;
        this.autor = null;
    }
    public Libro(String tituloP, float precioP, int stockP, Autor autorP) {
        this.titulo = tituloP;
        this.precio = precioP;
        this.stock = stockP;
        this.autor = autorP;
    }
//Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setPrecio(float precioP) {
        this.precio = precioP;
    }
    //Metodos
    public void   aumentarStock(int agregar)
    {
        stock+=agregar;
    }
    public String imprimirDatos()
    {
        return "Título: " + getTitulo() + ", Precio: " + getPrecio() + ", Stock: " + getStock() + ", Autor: " + getAutor().getNombre();
    }
    public String imprimirAutor()
    {
        return  "Autor: " + getAutor().getNombre() +" "+ getAutor().getApellido() + " Email:"+ getAutor().getEmail()+ " Genero: "+ getAutor().getGenero();
    }
    public String imprimirMensaje ()
    {
        return  "El libro "+getTitulo()+" de " + getAutor().getNombre()+". Se vende a " + getPrecio()+" pesos";

    }
}
