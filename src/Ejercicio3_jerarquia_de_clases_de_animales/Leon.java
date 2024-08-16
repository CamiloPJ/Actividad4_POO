package Ejercicio3_jerarquia_de_clases_de_animales;

/**
 * Esta clase concreta denominada Leon es una subclase de Felino.
 * @version 1.2/2020
 */
public class Leon extends Felino {

    /**
     * Metodo que devuelve un String con el sonido de un leon.
     * @return Un valor String con el sonido de un leon: "Rugido"
     */
    public String getSonido() {
        return "Rugido";
    }

    /**
     * Metodo que devuelve un String con los alimentos de un leon.
     * @return Un valor String con la alimentacion de un leon: "Carnivoro"
     */
    public String getAlimentos() {
        return "Carnivoro";
    }

    /**
     * Metodo que devuelve un String con el habitat de un leon.
     * @return Un valor String con el habitat de un leon: "Praderas"
     */
    public String getHabitat() {
        return "Praderas";
    }

    /**
     * Metodo que devuelve un String con el nombre cientifico de un leon.
     * @return Un valor String con el nombre cientifico de un leon: "Panthera leo"
     */
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}

