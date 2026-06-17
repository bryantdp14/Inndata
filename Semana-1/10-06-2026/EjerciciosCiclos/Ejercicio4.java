package EjerciciosCiclos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número límite (N): ");
        int n = teclado.nextInt();

        if (n < 1) {
            System.out.println("Por favor, ingrese un número entero mayor o igual a 1.");
        } else {
            System.out.println("\nImprimiendo números desde el 1 hasta el " + n + ":");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }

        teclado.close();
    }
}
