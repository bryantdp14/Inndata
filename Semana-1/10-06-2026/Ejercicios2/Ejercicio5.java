package Ejercicios2;

import java.util.Scanner;

public class Ejercicio5 {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== MENÚ DE OPCIONES ===");
        System.out.println("1 - Encontrar si tu número es par o impar");
        System.out.println("2 - Encontrar el número mayor de 4 números ingresados");
        System.out.println("3 - Realizar el índice de masa corporal (IMC)");
        System.out.print("Elija una opción (1-3): ");
        int opcion = teclado.nextInt();

        System.out.println(); 

        switch (opcion) {
            case 1:
                System.out.print("Ingrese un número entero: ");
                int num = teclado.nextInt();
                if (num % 2 == 0) {
                    System.out.println("El número " + num + " es PAR.");
                } else {
                    System.out.println("El número " + num + " es IMPAR.");
                }
                break;

            case 2:
                System.out.println("Ingrese 4 números separados por espacios o enter:");
                int n1 = teclado.nextInt();
                int n2 = teclado.nextInt();
                int n3 = teclado.nextInt();
                int n4 = teclado.nextInt();
                
                int mayor = n1;
                if (n2 > mayor) mayor = n2;
                if (n3 > mayor) mayor = n3;
                if (n4 > mayor) mayor = n4;
                
                System.out.println("El número mayor de los 4 ingresados es: " + mayor);
                break;

            case 3:
                System.out.print("Ingrese su peso en kilogramos (ej. 75.5): ");
                double peso = teclado.nextDouble();
                System.out.print("Ingrese su altura en metros (ej. 1.75): ");
                double altura = teclado.nextDouble();
                
                double imc = peso / (altura * altura);
                System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f\n", imc);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        teclado.close();
    }
}
