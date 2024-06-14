import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class ColaPrioridad <T>{
    private ArrayList<ElementoPrioridad<T>> cola;

    public ColaPrioridad() {
        cola = new ArrayList<>();
    }

    public void agregar(T elemento, int prioridad) {
        ElementoPrioridad<T> elementoPrioridad = new ElementoPrioridad<>(elemento, prioridad);
        cola.add(elementoPrioridad);
        ordenarCola();
    }

    private void ordenarCola() {

        cola.sort(Comparator.<ElementoPrioridad<T>>comparingInt(elemento -> elemento.getPrioridad())
                .thenComparingInt(elemento -> elemento.getOrdenLlegada()));
    }

    public T quitar() {
        if (cola.isEmpty()) {
            return null;
        }
        return cola.remove(0).getElemento();
    }

    public T obtenerMayorPrioridad() {
        if (cola.isEmpty()) {
            return null;
        }
        return cola.get(0).getElemento();
    }
}
