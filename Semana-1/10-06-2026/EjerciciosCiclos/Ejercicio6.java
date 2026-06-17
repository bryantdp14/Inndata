package EjerciciosCiclos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Creador de Calendario Mensual de Tareas ---");
        
        System.out.print("¿Cuántos días tiene el mes a organizar? (28-31): ");
        int diasDelMes = teclado.nextInt();
        teclado.nextLine(); 
        
        if (diasDelMes < 28 || diasDelMes > 31) {
            System.out.println("Error: Un mes solo puede tener entre 28 y 31 días.");
        } else {
            String[] tareas = new String[diasDelMes];

            System.out.println("--- Registro de Tareas ---");
            System.out.println("Escriba la tarea principal para cada día (o pulse Enter si no hay actividades):");

            for (int i = 0; i < diasDelMes; i++) {
                System.out.print("Día " + (i + 1) + ": ");
                String tarea = teclado.nextLine().trim();
                
                if (tarea.isEmpty()) {
                    tareas[i] = "Sin actividades pendientes";
                } else {
                    tareas[i] = tarea;
                }
            }

   
            for (int i = 0; i < diasDelMes; i++) {
    
                System.out.printf("Día", (i + 1), tareas[i]);
            }
            System.out.println("=========================================");
        }

        teclado.close();
    }
}
