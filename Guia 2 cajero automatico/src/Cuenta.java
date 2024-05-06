public class Cuenta {
    private float saldo;

    //constructor vacio
    public Cuenta() {
        this.saldo = 0;
    }

    //constructor para agregar saldo
    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    //Metodos
    // Agrega saldo a la cuenta de la cantidad recibida
    public void   ingresa (float dineroIngresado) {
        saldo += dineroIngresado;
    }
    // Extrae saldo indicado si es menor o igual al saldo de la cuenta
    public void extraer (float dineroAExtraer)
    {
        saldo-= dineroAExtraer;

    }
    // validar que el saldo sea mayor a la extraccion para no dejar cuenta en negativo
    public boolean validacionAntesDeExtraccion(float c) {
        return saldo >= c;
    }
}
