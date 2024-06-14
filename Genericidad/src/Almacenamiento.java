import java.util.ArrayList;
import java.util.List;

public class Almacenamiento<T> {

    ArrayList<T> item;

    public Almacenamiento() {
        this.item = new ArrayList<>();
    }

    public void agregar(T objeto) {
        item.add(objeto);
    }

    public boolean eliminar(T objeto) {
        return item.remove(objeto);
    }

    public boolean buscar(T objeto) {
        return item.contains(objeto);
    }

    // Método para obtener todos los objetos en el almacenamiento
    public List<T> obtenerTodos() {
        return new ArrayList<>(item);
    }

    // Método para mostrar todos los objetos en el almacenamiento
    public void mostrarTodos() {
        for (T item : this.item) {
            System.out.println(item);
        }
    }
}