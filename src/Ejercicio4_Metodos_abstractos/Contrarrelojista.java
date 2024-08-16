package Ejercicio4_Metodos_abstractos;

/**
 * Esta clase denominada Contrarrelojista es un tipo de Ciclista que se
 * encuentra mejor adaptado a las etapas contrarreloj. Posee un nuevo
 * atributo: su velocidad máxima.
 * @version 1.2/2020
 */
public class Contrarrelojista extends Ciclista {
    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Método que devuelve la velocidad máxima de un contrarrelojista
     * @return La velocidad máxima de un contrarrelojista
     */
    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Método que establece la velocidad máxima de un contrarrelojista
     * @param velocidadMaxima Parámetro que especifica la velocidad máxima de un contrarrelojista
     */
    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Método que muestra en pantalla los datos de un contrarrelojista
     */
    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Velocidad máxima = " + velocidadMaxima);
    }

    /**
     * Método que devuelve el tipo de ciclista
     * @return Un valor String con el texto "Es un contrarrelojista"
     */
    protected String imprimirTipo() {
        return "Es un contrarrelojista";
    }
}
