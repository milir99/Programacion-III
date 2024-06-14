class ElementoPrioridad<T> {
    private T elemento;
    private int prioridad;
    private static int contador = 0; // Para mantener el orden de llegada
    private int ordenLlegada;

    public ElementoPrioridad(T elemento, int prioridad) {
        this.elemento = elemento;
        this.prioridad = prioridad;
        this.ordenLlegada = contador++;
    }

    public T getElemento() {
        return elemento;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getOrdenLlegada() {
        return ordenLlegada;
    }
}
