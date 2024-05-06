public class Ausente extends Socios {
    private float cuotaMantenimiento;
    private float valorReduccido;

    public Ausente(float cuotaMantenimiento, float valorReduccido,String nombreP,String idP,String telefonoP,boolean estado) {
        super( nombreP,  idP,  telefonoP,estado);
        this.cuotaMantenimiento = cuotaMantenimiento;
        this.valorReduccido = valorReduccido;
    }

    public Ausente() {
        super();
        this.cuotaMantenimiento =0;
        this.valorReduccido = 0;
    }

    public float getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    public void setCuotaMantenimiento(float cuotaMantenimientoP) {
        this.cuotaMantenimiento = cuotaMantenimientoP;
    }

    public float getValorReduccido() {
        return valorReduccido;
    }

    public void setValorReduccido(float valorReduccidoP) {
        this.valorReduccido = valorReduccidoP;
    }
    @Override
    public String toString()
    {
        return super.toString()+" Cuota Mantenimiento:  "+cuotaMantenimiento+" Valor Reducido: "+valorReduccido;
    }

    @Override
    public float pagoCuota() {
        return cuotaMantenimiento+ valorReduccido;
    }
}
