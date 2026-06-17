package Ejercicios;

import java.util.Scanner;

public class Probabilidad {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de casos favorables: ");
        int casosFavorables = scanner.nextInt();
        System.out.print("Ingrese el número de casos posibles: ");
        int casosPosibles = scanner.nextInt();
        scanner.close();

        double probabilidad = (double) casosFavorables / casosPosibles;

        double porcentaje = probabilidad * 100;

        System.out.println("La probabilidad es: " + probabilidad);
        System.out.println("En porcentaje es: " + porcentaje + "%");
    }
}
