abstract public class Socios {
    private String nombre;
    private String id;
    private String telefono;
    private boolean estadoCuota;

    public Socios() {
        this.nombre = "";
        this.id = "";
        this.telefono = "";
        this.estadoCuota=false;
    }
    public Socios(String nombreP, String idP, String telefonoP,boolean estadoCuotaP) {
        this.nombre = nombreP;
        this.id = idP;
        this.telefono = telefonoP;
        this.estadoCuota= estadoCuotaP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreP) {
        this.nombre = nombreP;
    }

    public String getId() {
        return id;
    }

    public void setId(String idP) {
        this.id = idP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefonoP) {
        this.telefono = telefonoP;
    }

    public boolean isEstadoCuota() {
        return estadoCuota;
    }

    public void setEstadoCuota(boolean estadoCuotaP) {
        this.estadoCuota = estadoCuotaP;
    }

    @Override
    public String toString()
{
    return " Nombre: "+nombre+" Id: "+id+" Telefono: "+telefono;
}
abstract public float pagoCuota();

}
