package EjerciciosSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquipoDeFut {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> nombres = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();
        List<Double> alturas = new ArrayList<>();
        List<Double> pesos = new ArrayList<>();
        List<Double> velocidades = new ArrayList<>();
        List<Integer> tiemposJugando = new ArrayList<>();

        System.out.println("¿Cuántos jugadores deseas registrar?");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); 

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Registro del Jugador #" + (i + 1) + " ---");
            
            System.out.print("Nombre: ");
            nombres.add(entrada.nextLine());

            System.out.print("Edad: ");
            edades.add(entrada.nextInt());

            System.out.print("Altura (ej. 1.75): ");
            alturas.add(entrada.nextDouble());

            System.out.print("Peso en kg (ej. 70.5): ");
            pesos.add(entrada.nextDouble());

            System.out.print("Velocidad máxima (km/h): ");
            velocidades.add(entrada.nextDouble());

            System.out.print("Tiempo jugando fútbol (años): ");
            tiemposJugando.add(entrada.nextInt());
            entrada.nextLine(); // Limpiar el salto de línea
        }

       
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Jugador: " + nombres.get(i) + 
                               " | Edad: " + edades.get(i) + " años" +
                               " | Altura: " + alturas.get(i) + "m" +
                               " | Peso: " + pesos.get(i) + "kg" +
                               " | Vel. Máx: " + velocidades.get(i) + " km/h" +
                               " | Experiencia: " + tiemposJugando.get(i) + " años.");
        }

        entrada.close();
    }
}
