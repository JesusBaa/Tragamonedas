package maquinatragamonedas;

/**
 * Clase principal para iniciar el juego de máquina tragamonedas con interfaz gráfica.
 * Se encarga de inicializar el modelo, la vista y el controlador, 
 * y de establecer las conexiones entre ellos.
 */
public class JuegoTragamonedasGUI {

    /**
     * Método principal del programa.
     * Aquí se crea e inicializa el modelo, la vista y el controlador, 
     * y se configura la relación entre la vista y el controlador.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Crear instancia del modelo
        MaquinaTragamonedas modelo = new MaquinaTragamonedas();

        // Crear instancia de la vista
        VistaTragamonedasGUI vista = new VistaTragamonedasGUI();

        // Crear instancia del controlador
        ControladorTragamonedas controlador = new ControladorTragamonedas(modelo, vista);

        // Conectar la vista con el controlador
        vista.setControlador(controlador);

        System.out.println("Programa iniciado correctamente");
    }
}
