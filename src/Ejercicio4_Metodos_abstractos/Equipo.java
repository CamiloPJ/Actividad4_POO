package Ejercicio4_Metodos_abstractos;

import java.util.*;

/**
 * Esta clase denominada Equipo modela un equipo de ciclismo
 * conformado por un vector de ciclistas. La clase tiene atributos como
 * el nombre del equipo, el país del equipo y el tiempo total acumulado
 * del equipo
 * @version 1.2/2020
 */
public class Equipo {
    private String nombre; // Atributo que define el nombre del equipo de ciclismo
    private static double totalTiempo; // Atributo que define el tiempo total obtenido por el equipo
    private String pais; // Atributo que define el país al que pertenece el equipo
    private Vector<Ciclista> listaCiclistas; // Atributo que define un vector de objetos ciclista

    /**
     * Constructor de la clase Equipo
     * @param nombre Parámetro que define el nombre del equipo
     * @param pais Parámetro que define el país del equipo
     */
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
        listaCiclistas = new Vector<>(); // Se crea el vector de ciclistas que conforma el equipo
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getPais() {
        return pais;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Método que añade un ciclista al vector de ciclistas de un equipo
     */
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }

    /**
     * Método que muestra en pantalla los nombres de los ciclistas que conforman un equipo
     */
    void listarEquipo() {
        for (Ciclista c : listaCiclistas) {
            System.out.println(c.getNombre());
        }
    }

    /**
     * Método que busca un ciclista ingresado por teclado
     */
        void buscarCiclista() {
        Scanner sc = new Scanner(System.in); // Se solicita texto ingresado por teclado
        System.out.print("Ingrese el nombre del ciclista: ");
        String nombreCiclista = sc.next();
        boolean encontrado = false;

        for (Ciclista c : listaCiclistas) {
            if (c.getNombre().equals(nombreCiclista)) { // Si el nombre ingresado se encuentra
                System.out.println(c.getNombre());
                c.imprimir(); // Muestra los detalles del ciclista
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Ciclista no encontrado.");
        }
    }

    /**
     * Método que calcula    el tiempo total de un equipo acumulando el tiempo obtenido por cada uno de sus ciclistas
     */
    void calcularTotalTiempo() {
        totalTiempo = 0; // Reinicia el tiempo total antes de recalcular
        for (Ciclista c : listaCiclistas) {
            totalTiempo += c.getTiempoAcumulado(); // Se acumula el tiempo del ciclista en el tiempo del equipo
        }
    }

    /**
     * Método que muestra en pantalla los datos de un equipo
     */
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
