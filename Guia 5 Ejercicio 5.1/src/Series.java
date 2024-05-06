public class Series implements Prestar {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private char genero;
    private String creador;

    public Series() {
        this.titulo = "";
        this.numeroTemporadas = 3;
        this.entregado = "false";
        this.genero = '';
        this.creador = " ";
    }

    public Series(String tituloP, int numeroTemporadasP, char generoP, String creadorP) {
        this.titulo = tituloP;
        this.numeroTemporadas = numeroTemporadasP;
        this.entregado = "false";
        this.genero = generoP;
        this.creador = creadorP;
    }

    public Series(String tituloP, String creadorP) {
        this.titulo = tituloP;
        this.numeroTemporadas = 3;
        this.entregado = "false";
        this.genero = '';
        this.creador = creadorP;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituloP) {
        this.titulo = tituloP;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadasP) {
        this.numeroTemporadas = numeroTemporadasP;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char generoP) {
        this.genero = generoP;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creadorP) {
        this.creador = creadorP;
    }
    public void entregar(){
        entregado=true;

    };
    @Override
    public String isEntregado(){
        return entregado;
    };
    public compareTo(Object a)
    {

    };
    @Override
    public String toString() {
        return "\nSERIE\n"
        "\nTitulo: " + getTitulo() + "\nNumero de temporadas: " + getNumeroTemporadas() + "\nGenero: " + getGenero() + "\nCreador: " + getCreador() + "\nPrestado: " + isEntregado();
    }

    @Override
    public void devolver() {

    }

    @Override
    public void compareTo(Object a) {

    }
}
