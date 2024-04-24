/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica_Cliente;

/**
 *
 * @author BIENVENIDO
 */
import java.util.ArrayList;

public class OrdenamientoSeleccion {

    public static void main(String[] args) {
        // Lista desordenada de tiempos de llegada
        ArrayList<Double> tiemposLlegada = new ArrayList<>();
        tiemposLlegada.add(12.56);
        tiemposLlegada.add(11.89);
        tiemposLlegada.add(13.21);
        tiemposLlegada.add(12.98);
        tiemposLlegada.add(12.74);

        // Imprimir lista desordenada
        System.out.println("Tiempos de llegada desordenados: " + tiemposLlegada);

        // Ordenar tiempos de llegada usando el algoritmo de selección
        ordenarSeleccion(tiemposLlegada);

        // Imprimir lista ordenada
        System.out.println("Tiempos de llegada ordenados: " + tiemposLlegada);

        // Mostrar el ganador y los siguientes lugares
        mostrarGanador(tiemposLlegada);
    }

    private static void ordenarSeleccion(ArrayList<Double> tiemposLlegada) {
        int n = tiemposLlegada.size();

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (tiemposLlegada.get(j) < tiemposLlegada.get(indiceMenor)) {
                    indiceMenor = j;
                }
            }

            // Intercambiar el elemento mínimo con el elemento en la posición actual
            double temp = tiemposLlegada.get(i);
            tiemposLlegada.set(i, tiemposLlegada.get(indiceMenor));
            tiemposLlegada.set(indiceMenor, temp);
        }
    }

    private static void mostrarGanador(ArrayList<Double> tiemposLlegada) {
        int n = tiemposLlegada.size();

        System.out.println("\nGanador:");
        System.out.println("Tiempo: " + tiemposLlegada.get(0));

        System.out.println("\nSegundos y terceros lugares:");
        for (int i = 1; i < 3 && i < n; i++) {
            System.out.println(i + "° lugar: Tiempo: " + tiemposLlegada.get(i));
        }
    }
}
