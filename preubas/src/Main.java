import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menu
        Scanner scan = new Scanner(System.in);





        int eleccion;
        // Leer la elección del usuario

        do {
            // Presentar las opciones del menú
            System.out.println(titulo);
            // Imprimir titulo
            System.out.println("1.Jugar");
            System.out.println("2.Salir del juego");
            // Leer la elección del usuario
            eleccion = scan.nextInt();

            // Realizar acciones basadas en la elección del usuario usando un switch
            switch (eleccion) {
                case 1:
                    // Si el usuario elige jugar, manejar encuentros
                    // Partida partida = listaPartidas.getFirst(); // Esto asigna la primera partida de la lista, pero deberías implementar la lógica para seleccionar o crear una partida
                    // manejarEncuentro(partida); // Llamar al método para manejar los encuentros del juego
                    System.out.println("Iniciando el juego...");
                    break;
                case 2:
                    // Si el usuario elige salir, terminar el programa
                    System.out.println("Saliendo del juego...");
                    System.exit(0);
                    break;
                default:
                    // Si la elección no es válida, mostrar un mensaje de error
                    System.out.println("Elección no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (eleccion != 1 && eleccion != 2);
    }
}



