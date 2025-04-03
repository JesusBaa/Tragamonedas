package maquinatragamonedas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que representa un carrete de la máquina tragamonedas.
 * Contiene una lista de símbolos y permite realizar un giro para obtener
 * un símbolo aleatorio.
 */
public class Carrete {
    private List<Simbolo> simbolos;

    /**
     * Constructor de la clase Carrete.
     * Inicializa el carrete con una lista predefinida de símbolos, cada uno 
     * asociado a la ruta de su imagen.
     */
    public Carrete() {
        simbolos = new ArrayList<>();
        simbolos.add(new Simbolo("/imagenes/uva.jpg"));      
        simbolos.add(new Simbolo("/imagenes/banana.jpg"));  
        simbolos.add(new Simbolo("/imagenes/bar.jpg"));     
        simbolos.add(new Simbolo("/imagenes/campana.jpg")); 
        simbolos.add(new Simbolo("/imagenes/cereza.jpg"));  
        simbolos.add(new Simbolo("/imagenes/corazon.jpg")); 
        simbolos.add(new Simbolo("/imagenes/diamante.jpg"));
        simbolos.add(new Simbolo("/imagenes/herradura.jpg"));
        simbolos.add(new Simbolo("/imagenes/limon.jpg"));   
        simbolos.add(new Simbolo("/imagenes/manzana.jpg")); 
        simbolos.add(new Simbolo("/imagenes/moneda.jpg"));  
        simbolos.add(new Simbolo("/imagenes/naranja.jpg")); 
        simbolos.add(new Simbolo("/imagenes/sandia.jpg"));  
        simbolos.add(new Simbolo("/imagenes/siete.jpg"));   
        simbolos.add(new Simbolo("/imagenes/trebol.jpg"));  
    }

    /**
     * Realiza un giro del carrete y devuelve un símbolo aleatorio.
     *
     * @return Un objeto de tipo Simbolo seleccionado aleatoriamente de la lista de símbolos.
     */
    public Simbolo girar() {
        Random random = new Random();
        return simbolos.get(random.nextInt(simbolos.size()));
    }
}
