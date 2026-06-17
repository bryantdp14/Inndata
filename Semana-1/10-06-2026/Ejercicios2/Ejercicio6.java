package Ejercicios2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana (ej. lunes, martes...): ");
        String dia = teclado.nextLine().trim().toLowerCase();

        System.out.println("\n--- Cronograma de Actividades ---");

        switch (dia) {
            case "lunes":
            case "miercoles":
            case "viernes":
                System.out.println("Mañana: Clases presenciales de programación de 8:00 a 12:00.");
                System.out.println("Tarde: Almuerzo, revisión de tareas y avance de proyectos en equipo.");
                System.out.println("Noche: Rutina de gimnasio (gimnasio / cardio) de 19:00 a 20:30 y cena.");
                break;

            case "martes":
            case "jueves":
                System.out.println("Mañana: Sesión de estudio autónomo, lectura técnica y resolución de bugs.");
                System.out.println("Tarde: Mentorías individuales y repaso de lógica de algoritmos.");
                System.out.println("Noche: Tiempo libre para ver series, videojuegos y descanso temprano.");
                break;

            case "sabado":
                System.out.println("Mañana: Taller práctico intensivo o Hackathon matutina.");
                System.out.println("Tarde: Reunión social con amigos o actividades familiares al aire libre.");
                System.out.println("Noche: Salida a cenar, descanso recreativo.");
                break;

            case "domingo":
                System.out.println("Todo el día: Descanso absoluto, organización de la habitación y planificación de la siguiente semana.");
                break;

            default:
                System.out.println("Día no reconocido.");
                break;
        }

        teclado.close();
    }
}
