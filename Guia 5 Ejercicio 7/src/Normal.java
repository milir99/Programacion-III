public class Normal extends Socios{
    private float cuotamensual;

    public Normal() {
        super();
        this.cuotamensual= 0;
    }
    public Normal(float cuotamensualP,String nombreP, String idP,String telefonoP,Boolean estado) {
        super( nombreP,  idP,  telefonoP,estado);
        this.cuotamensual = cuotamensualP;
    }

    public float getCuotamensual() {
        return cuotamensual;
    }

    public void setCuotamesual(float cuotamesualP) {
        this.cuotamensual = cuotamesualP;
    }
    @Override
    public String toString()
    {
        return super.toString()+" Cuota mensual: "+cuotamensual;
    }

    public float pagoCuota() {
        return cuotamensual;
    }
}
