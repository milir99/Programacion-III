package modelo;

public class EnvioPorAire extends Servicios {
    private String aerolinea;
    private String tipoEnvio;

    public EnvioPorAire(String idP, float pesoP, String destinoP, boolean seguroP, boolean entregaDiaP, String aerolinea, String tipoEnvio) {
        super(idP, pesoP, destinoP, seguroP, entregaDiaP);
        this.aerolinea = aerolinea;
        this.tipoEnvio = tipoEnvio;
    }

    public EnvioPorAire() {
        super();
        this.aerolinea = "";
        this.tipoEnvio = "";
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolineaP) {
        this.aerolinea = aerolineaP;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvioP) {
        this.tipoEnvio = tipoEnvioP;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAerolinea: " + aerolinea + "\nTipo de envio: " + tipoEnvio;
    }

    @Override
    public float calcularTarifaEnvio() {
        float total = super.getPeso() * 30;

        if (aerolinea.equalsIgnoreCase("AA")) {
            total += total * 0.5;

        }
        if (tipoEnvio == "Express") {
            total += 1000;
        }

        return total;
    }



    @Override
    public float calcularCostoAdicional() {
        float seguro=2500;
        double entregaDia= 0.5;
        float totalEnvio = calcularTarifaEnvio();
        float total=0;
        if(super.isSeguro())
        {
            total=totalEnvio+seguro;
        }
        if(isEntregaDia())
        {
            total=totalEnvio + (totalEnvio*(float)entregaDia);
        }
        total=totalEnvio-totalEnvio;

        return total;
    }
    @Override
    public float CalcularTotalPaquete() {
        return calcularCostoAdicional()+calcularTarifaEnvio();
    }
}
