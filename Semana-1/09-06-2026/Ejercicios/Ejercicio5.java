package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la aceleración: ");
        double aceleracion = scanner.nextDouble();
        System.out.print("Ingrese la velocidad inicial: ");
        double velocidadInicial = scanner.nextDouble();
        System.out.print("Ingrese el tiempo: ");
        double tiempo = scanner.nextDouble();
        scanner.close();
        double fuerza = 10 * aceleracion;
        System.out.println("La fuerza es: " + fuerza + " Newtons");

        double v = velocidadInicial + (aceleracion * tiempo);
        System.out.println("La velocidad final es: " + v + " m/s");

    }
    
}
