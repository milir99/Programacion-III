import java.util.HashSet;

public class Conjunto<T> {
    HashSet<T> conjunto;

    public Conjunto() {
        this.conjunto = new HashSet<T>();
    }
    public void agregar (T obj){
         conjunto.add(obj);
    }
    public boolean eliminar(T obj)
    {
        return conjunto.remove(obj);
    }
    public boolean contiene(T obj)
    {
        if(conjunto.isEmpty())
        {
            throw new IllegalStateException("El conjunto esta vacio");
        }
      return conjunto.contains(obj);
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "conjunto=" + conjunto +
                '}';
    }
}
