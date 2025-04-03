package maquinatragamonedas;

/**
 * Clase que representa un símbolo de la máquina tragamonedas.
 * Cada símbolo está asociado a la ruta de su imagen.
 */
public class Simbolo {
    private String rutaImagen;

    /**
     * Constructor de la clase Simbolo.
     * Inicializa el símbolo con la ruta de su imagen.
     *
     * @param rutaImagen La ruta de la imagen que representa el símbolo.
     */
    public Simbolo(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    /**
     * Obtiene la ruta de la imagen del símbolo.
     *
     * @return La ruta de la imagen que representa el símbolo.
     */
    public String getRutaImagen() {
        return rutaImagen;
    }
}
