package Ejercicio3_jerarquia_de_clases_de_animales;

/**
 * Esta clase concreta denominada Gato es una subclase de Felino.
 * @version 1.2/2020
 */
public class Gato extends Felino {

    /**
     * Metodo que devuelve un String con el sonido de un gato.
     * @return Un valor String con el sonido de un gato: "Maullido"
     */
    public String getSonido() {
        return "Maullido";
    }

    /**
     * Metodo que devuelve un String con los alimentos de un gato.
     * @return Un valor String con la alimentacion de un gato: "Ratones"
     */
    public String getAlimentos() {
        return "Ratones";
    }

    /**
     * Metodo que devuelve un String con el habitat de un gato.
     * @return Un valor String con el habitat de un gato: "Domestico"
     */
    public String getHabitat() {
        return "Domestico";
    }

    /**
     * Metodo que devuelve un String con el nombre cientifico de un gato.
     * @return Un valor String con el nombre cientifico de un gato: "Felis silvestris catus"
     */
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}
