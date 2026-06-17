package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura (m): ");
        double altura = scanner.nextDouble();
        double indice = (altura * altura) / peso  ;
        System.out.println("El índice de masa corporal de " + nombre + " es: " + indice);
        scanner.close();

    }

    
}