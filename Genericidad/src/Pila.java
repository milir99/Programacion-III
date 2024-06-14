import java.util.ArrayList;

public class Pila <P>{
    ArrayList<P> pila;
    public Pila()
    {
        this.pila= new ArrayList<>();

    }
    public void agregar(P objeto)
    {
        pila.add(objeto);
    }
    public boolean estaVacia(){
 return pila.isEmpty();
    }
    public  int tamanio(){
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.size();
    }

    public void eliminar(){
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
       pila.remove(pila.size() - 1);
    }
    public String mostrar(){
    String datos ="";
    for(P obj : pila)
    {
        datos=datos +"\n"+ obj;
    }
    return datos;}
}
