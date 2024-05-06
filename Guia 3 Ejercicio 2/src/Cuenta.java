public class Cuenta {
    private String id;
    private float balance;
    private Cliente cliente;
    private String[] operaciones;//listado de operaciones
    private int numDeOperacion;
    private char deudor;//Para saber si puede tener saldo negativo o no Y/N

    public Cuenta() {
        this.id = "";
        this.balance = 0;
        this.cliente = null;
        this.operaciones = new String[4];
        this.numDeOperacion = 0;
        this.deudor = '-';
    }

    public Cuenta(String idP, float balanceP, Cliente clienteP, char deudorP) {
        this.id = idP;
        this.balance = balanceP;
        this.cliente = clienteP;
        this.operaciones = new String[4];
        this.numDeOperacion = 0;
        this.deudor = deudorP;
    }

    public char getDeudor() {
        return deudor;
    }

    public String getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setDeudor(char deudor) {
        this.deudor = deudor;
    }

    // agregar deposito al balance y agregar operacion
    public void depositar(float monto) {
        balance += monto;
        agregarOperacion("Depositó", monto);
    }

    //Extraer al balance y agregar operacion
    public String Extraccion(float monto) {
        String mensaje;
        int limite = -2000;
        char condicion = 'Y';
        if (validarBalance(monto, limite, condicion)) {
            balance -= monto;
            mensaje = "Extracción exitosa";
            agregarOperacion("retiró", monto);
        } else {
            mensaje = "No se puede realizar la extracción";
        }
        return mensaje;
    }


    // validar si el balance es menor al monto a extraer o no
    private boolean validarBalance(float extraer, int limite, char condicion) {
        return (deudor == 'Y') ? (balance - extraer) >= limite : (balance - extraer) >= 0;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    private void agregarOperacion(String tipo, float monto) {
        if (numDeOperacion >= operaciones.length) {
            numDeOperacion = 0;
            operaciones[numDeOperacion] = "El cliente " + getCliente().getNombre() + " ,  " + tipo + " " + monto;

        } else {
            operaciones[numDeOperacion] = "El cliente " + getCliente().getNombre() + " ,  " + tipo +" " + monto;
            numDeOperacion++;
        }


    }
    public String imprimirCuenta() {
        StringBuilder cuentaDetails = new StringBuilder();
        cuentaDetails.append("ID de Cuenta: ").append(getId()).append("\n");
        cuentaDetails.append("Balance: ").append(getBalance()).append("\n");
        cuentaDetails.append("Cliente: ").append(getCliente().getNombre()).append("\n"); // Assuming Cliente class has a method getNombre() to get client's name
        cuentaDetails.append("Estado deudor: ").append(getDeudor() == 'Y' ? "Permite saldo negativo" : "No permite saldo negativo").append("\n");
        cuentaDetails.append("Operaciones:\n");
        for (String operacion : getOperaciones()) {
            if (operacion != null) {
                cuentaDetails.append(operacion).append("\n");
            }
        }
        return cuentaDetails.toString();
    }
}
