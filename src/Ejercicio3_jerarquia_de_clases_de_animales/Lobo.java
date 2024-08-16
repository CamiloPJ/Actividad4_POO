package Ejercicio3_jerarquia_de_clases_de_animales;

/**
 * Esta clase concreta denominada Lobo es una subclase de Canido.
 * @version 1.2/2020
 */
public class Lobo extends Canido {

    /**
     * Metodo que devuelve un String con el sonido de un lobo.
     * @return Un valor String con el sonido de un lobo: "Aullido"
     */
    public String getSonido() {
        return "Aullido";
    }

    /**
     * Metodo que devuelve un String con los alimentos de un lobo.
     * @return Un valor String con el tipo de alimentacion de un lobo: "Carnivoro"
     */
    public String getAlimentos() {
        return "Carnivoro";
    }

    /**
     * Metodo que devuelve un String con el habitat de un lobo.
     * @return Un valor String con el habitat de un lobo: "Bosque"
     */
    public String getHabitat() {
        return "Bosque";
    }

    /**
     * Metodo que devuelve un String con el nombre cientifico de un lobo.
     * @return Un valor String con el nombre cientifico de un lobo: "Canis lupus"
     */
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}
