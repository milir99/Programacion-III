package Gestion;

import Modelo.Jugador;

import java.util.ArrayList;
import java.util.HashSet;

public class TablaColorOjo extends TablaClaveValor{

    @Override
    public void agregar (ArrayList<Jugador> listaJugadores){

        for (Jugador jugadorActual : listaJugadores) {
            String colorOjosActual = jugadorActual.getEyeColor();

            if (!getTabla().containsKey(colorOjosActual)) {
                HashSet<Jugador> jugadoresConEsteColor = new HashSet<>();
                jugadoresConEsteColor.add(jugadorActual);
                getTabla().put(colorOjosActual,jugadorActual);
            } else {
                HashSet<Jugador> listado = (HashSet<Jugador>) getTabla().get(colorOjosActual);
                listado.add(jugadorActual);
            }
        }

    }

}
