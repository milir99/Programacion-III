import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase principal del juego
public class MenuJuego extends JFrame {

    public MenuJuego() {
        setTitle("Forgotten Depth");
        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un panel para mostrar las opciones de menú
        JPanel panel = new JPanel(new GridLayout(3, 1));

        // Crear botones para las opciones de menú
        JButton jugarButton = new JButton("Jugar");
        JButton salirButton = new JButton("Salir del juego");

        // Agregar los botones al panel
        panel.add(new JLabel("Bienvenido a Forgotten Depth"));
        panel.add(jugarButton);
        panel.add(salirButton);

        // Agregar el panel a la ventana
        add(panel);

        // Manejar la acción del botón "Jugar"
        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ejecutarJuego();
            }
        });

        // Manejar la acción del botón "Salir del juego"
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la aplicación
                System.exit(0);
            }
        });
    }}
