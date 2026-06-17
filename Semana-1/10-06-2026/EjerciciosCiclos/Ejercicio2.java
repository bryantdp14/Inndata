package EjerciciosCiclos;

import java.util.Scanner;

public class Ejercicio2 {
       public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();

        int divisores = 0;

        if (numero <= 1) {
            System.out.println("El número " + numero + " NO es primo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println("El número " + numero + " SÍ es primo.");
            } else {
                System.out.println("El número " + numero + " NO es primo ");
            }
        }

        teclado.close();
    }
}
