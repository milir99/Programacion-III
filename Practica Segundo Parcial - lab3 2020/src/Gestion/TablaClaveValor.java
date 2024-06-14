package Gestion;
import Modelo.Jugador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

abstract public class TablaClaveValor <K,V>{
    private TreeMap<K,V> tabla;
    public TablaClaveValor() {
        this.tabla = new TreeMap<>();
    }
    public TablaClaveValor(TreeMap<K, V> tabla) {
        this.tabla = tabla;
    }

    public TreeMap<K, V> getTabla() {
        return tabla;
    }
    abstract  public void agregar (ArrayList<Jugador> lista);
   //abstract public V devolver(K clave);
    //public int contar ()



    public String listar() {
        return "\nTablaClaveValor\n" +
                "\ntabla=\n" + tabla +
                "\n";
    }



    public void setTabla(TreeMap<K, V> tabla) {
        this.tabla = tabla;
    }
}
