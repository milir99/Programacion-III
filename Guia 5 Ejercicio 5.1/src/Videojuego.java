public class Videojuego implements Prestar {
    private String titulo;
    private Double horaEstimada;
   private boolean entregado;
    private String genero;
    private String compania;
    public Videojuego() {
        this.titulo = "";
        this.horaEstimada = 0;
        this.entregado = "false";
        this.genero = "";
        this.compania ="";
    }
    public Videojuego(String tituloP, Double horaEstimadaP, String generoP, String companiaP) {
        this.titulo = tituloP;
        this.horaEstimada = horaEstimadaP;
        this.entregado = "false";
        this.genero = generoP;
        this.compania = companiaP;
    }
    public Videojuego(String tituloP, Double horaEstimadaP) {
        this.titulo = tituloP;
        this.horaEstimada = horaEstimadaP;
        this.entregado = "false";
        this.genero = "";
        this.compania = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituloP) {
        this.titulo = tituloP;
    }

    public Double getHoraEstimada() {
        return horaEstimada;
    }

    public void setHoraEstimada(Double horaEstimadaP) {
        this.horaEstimada = horaEstimadaP;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String generoP) {
        this.genero = generoP;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String companiaP) {
        this.compania = companiaP;
    }

    @Override
    public String toString()
    {
        return "\nSERIE\n""\nTitulo: "+titulo+"\nHoras Estimadas: "+horaEstimada+"\nGenero: "+genero+"\nCompania: "+getCompania()+"\nPrestado: "+entregado;
    }
}
