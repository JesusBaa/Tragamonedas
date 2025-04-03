package maquinatragamonedas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que actúa como controlador en el juego de máquina tragamonedas.
 * Se encarga de coordinar la interacción entre el modelo y la vista, 
 * así como de manejar la lógica del juego.
 */
public class ControladorTragamonedas {
    private MaquinaTragamonedas modelo;
    private VistaTragamonedasGUI vista;

    /**
     * Constructor de la clase ControladorTragamonedas.
     * Inicializa el controlador con el modelo y la vista proporcionados.
     *
     * @param modelo Instancia del modelo que contiene la lógica de la máquina tragamonedas.
     * @param vista Instancia de la vista que muestra la interfaz gráfica al usuario.
     */
    public ControladorTragamonedas(MaquinaTragamonedas modelo, VistaTragamonedasGUI vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    /**
     * Método que ejecuta el juego de la máquina tragamonedas.
     * Gira los carretes, actualiza la vista con los resultados y muestra un mensaje
     * indicando si el jugador ganó o perdió.
     */
    public void jugar() {
        // Obtiene los resultados de girar los carretes
        List<Simbolo> resultados = modelo.girarCarretes();
        List<String> rutasImagenes = new ArrayList<>();
        
        // Extrae las rutas de imagen de los símbolos
        for (Simbolo simbolo : resultados) {
            rutasImagenes.add(simbolo.getRutaImagen());
        }

        // Actualiza la vista con los símbolos obtenidos
        vista.mostrarSimbolos(rutasImagenes);

        // Verifica si la combinación es ganadora y muestra el mensaje adecuado
        if (modelo.esCombinacionGanadora(resultados)) {
            vista.mostrarMensajeGanador();
        } else {
            vista.mostrarMensajePerdedor();
        }
    }
}
