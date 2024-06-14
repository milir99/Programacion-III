import java.util.ArrayList;
import java.util.Comparator;

public class ListaOrdenada<T> {
    private ArrayList<T> lista;
    private Comparator<T> comparador;

    // Constructor que acepta un booleano para determinar el orden
    public ListaOrdenada(boolean ascendente) {
        if (ascendente) {
            this.comparador = (a, b) -> ((Comparable<T>) a).compareTo(b);
        } else {
            this.comparador = (a, b) -> ((Comparable<T>) b).compareTo(a);
        }
        this.lista = new ArrayList<>();
    }

    // Método para agregar un elemento manteniendo el orden
    public void agregar(T elemento) {
        lista.add(elemento);
        lista.sort(comparador);
    }

    // Método para eliminar un elemento
    public boolean eliminar(T elemento) {
        return lista.remove(elemento);
    }

    // Método para obtener un elemento en una posición específica
    public T obtener(int posicion) {
        if (posicion < 0 || posicion >= lista.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites: " + posicion);
        }
        return lista.get(posicion);
    }

    // Método para obtener el tamaño de la lista
    public int tamaño() {
        return lista.size();
    }

    @Override
    public String toString() {
        return "ListaOrdenada" +
                "lista=" + lista ;
    }
}
