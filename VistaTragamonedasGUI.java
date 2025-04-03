package maquinatragamonedas;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Clase que representa la interfaz gráfica de la máquina tragamonedas.
 * Proporciona los componentes visuales y métodos para interactuar con el controlador y mostrar resultados.
 */
public class VistaTragamonedasGUI {
    private JFrame frame;
    private JLabel resultadoLabel1, resultadoLabel2, resultadoLabel3;
    private JButton botonGirar;
    private JLabel mensajeLabel;
    private ControladorTragamonedas controlador;

    /**
     * Constructor de la clase VistaTragamonedasGUI.
     * Configura la ventana principal y los componentes visuales necesarios para el juego.
     */
    public VistaTragamonedasGUI() {
        frame = new JFrame("Máquina Tragamonedas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        // Panel para los carretes
        JPanel panelCarretes = new JPanel(new GridLayout(1, 3, 10, 10));
        
        // Configura las etiquetas para los resultados
        resultadoLabel1 = new JLabel();
        resultadoLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        resultadoLabel1.setVerticalAlignment(SwingConstants.CENTER);
        
        resultadoLabel2 = new JLabel();
        resultadoLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        resultadoLabel2.setVerticalAlignment(SwingConstants.CENTER);
        
        resultadoLabel3 = new JLabel();
        resultadoLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        resultadoLabel3.setVerticalAlignment(SwingConstants.CENTER);

        // Añadir las etiquetas al panel
        panelCarretes.add(resultadoLabel1);
        panelCarretes.add(resultadoLabel2);
        panelCarretes.add(resultadoLabel3);

        // Configura el botón para girar los carretes
        botonGirar = new JButton("Girar");
        botonGirar.addActionListener(e -> {
            if (controlador != null) {
                controlador.jugar();
            }
        });

        // Configura el mensaje en la parte superior
        mensajeLabel = new JLabel("", SwingConstants.CENTER);
        mensajeLabel.setFont(new Font("Arial", Font.BOLD, 16));

        frame.add(panelCarretes, BorderLayout.CENTER);
        frame.add(botonGirar, BorderLayout.SOUTH);
        frame.add(mensajeLabel, BorderLayout.NORTH);

        frame.setVisible(true);
    }

    /**
     * Configura el controlador para manejar las acciones de la vista.
     *
     * @param controlador Instancia del controlador que se encargará de gestionar la lógica del juego.
     */
    public void setControlador(ControladorTragamonedas controlador) {
        this.controlador = controlador;
    }

    /**
     * Muestra los símbolos en los carretes utilizando imágenes.
     *
     * @param rutasImagenes Lista con las rutas de las imágenes que se mostrarán en los carretes.
     */
    public void mostrarSimbolos(List<String> rutasImagenes) {
        resultadoLabel1.setIcon(new ImageIcon(getClass().getResource(rutasImagenes.get(0))));
        resultadoLabel2.setIcon(new ImageIcon(getClass().getResource(rutasImagenes.get(1))));
        resultadoLabel3.setIcon(new ImageIcon(getClass().getResource(rutasImagenes.get(2))));
    }

    /**
     * Muestra un mensaje cuando el jugador gana.
     */
    public void mostrarMensajeGanador() {
        mensajeLabel.setText("¡Felicidades! ¡Has ganado!");
    }

    /**
     * Muestra un mensaje cuando el jugador pierde.
     */
    public void mostrarMensajePerdedor() {
        mensajeLabel.setText("¡Sigue intentando! ¡Suerte para la próxima!");
    }
}
