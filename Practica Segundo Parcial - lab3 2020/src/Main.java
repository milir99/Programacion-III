import Gestion.TablaColorOjo;
import Modelo.Jugador;
import Modelo.jsonAJava;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        jsonAJava.pasarDatosALista(listaJugadores);
        System.out.println(listaJugadores);


        TablaColorOjo colorDeOjos = new TablaColorOjo();
        System.out.println(colorDeOjos);


        /*TablaClaveValor<String,HashSet<Jugador>> position = new TablaClaveValor<>();
        for (Jugador jugadorActual : listaJugadores) {
            String positionActual = jugadorActual.getPosition();
            if ( !position.getTabla().containsKey(positionActual) ) {
                HashSet<Jugador> jugadoresConEstePosition = new HashSet<>();
                jugadoresConEstePosition.add(jugadorActual);
                position.agregar(positionActual, jugadoresConEstePosition);
            } else {
                HashSet<Jugador> listado =  position.getTabla().get(positionActual);
                listado.add(jugadorActual);
            }
        }
        System.out.println(position.listar())*/

    }
}