class Utilitario extends Vehiculo {
    private String tipoCarga;

    public Utilitario(String patenteP, String marcaP, String modeloP, int anioP, double kilometrajeP, double precioAlquilerDiarioP, String estadoP, String tipoCargaP) {
        super(patenteP, marcaP, modeloP, anioP, kilometrajeP, precioAlquilerDiarioP, estadoP);
        this.tipoCarga = tipoCarga;
    }
}