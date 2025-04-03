package maquinatragamonedas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el modelo de la máquina tragamonedas.
 * Contiene la lógica para girar los carretes y verificar combinaciones ganadoras.
 */
public class MaquinaTragamonedas {
    private Carrete carrete1, carrete2, carrete3;

    /**
     * Constructor de la clase MaquinaTragamonedas.
     * Inicializa los tres carretes necesarios para el funcionamiento de la máquina.
     */
    public MaquinaTragamonedas() {
        carrete1 = new Carrete();
        carrete2 = new Carrete();
        carrete3 = new Carrete();
    }

    /**
     * Gira los tres carretes de la máquina tragamonedas y devuelve los resultados.
     *
     * @return Una lista de objetos de tipo Simbolo que representan los resultados
     * obtenidos al girar los carretes.
     */
    public List<Simbolo> girarCarretes() {
        List<Simbolo> resultados = new ArrayList<>();
        resultados.add(carrete1.girar());
        resultados.add(carrete2.girar());
        resultados.add(carrete3.girar());
        return resultados;
    }

    /**
     * Verifica si la combinación obtenida es ganadora.
     * Una combinación es ganadora si los tres símbolos tienen la misma imagen.
     *
     * @param resultados Una lista de objetos de tipo Simbolo que representan los 
     * resultados obtenidos al girar los carretes.
     * @return true si los tres símbolos tienen la misma imagen, false en caso contrario.
     */
    public boolean esCombinacionGanadora(List<Simbolo> resultados) {
        return resultados.get(0).getRutaImagen().equals(resultados.get(1).getRutaImagen())
                && resultados.get(1).getRutaImagen().equals(resultados.get(2).getRutaImagen());
    }
}
