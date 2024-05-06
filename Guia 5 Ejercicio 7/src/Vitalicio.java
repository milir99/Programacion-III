public class Vitalicio extends Socios {
    public Vitalicio(String nombreP, String idP, String telefonoP) {
        super( nombreP,  idP,  telefonoP,true);
    }

    @Override
    public float pagoCuota() {
        return 0;
    }
}
