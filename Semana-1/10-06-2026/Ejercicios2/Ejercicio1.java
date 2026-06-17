package Ejercicios2;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Buscador del Mayor de 4 Números ---");

        System.out.print("Ingrese el primer número: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = teclado.nextInt();

        System.out.print("Ingrese el cuarto número: ");
        int num4 = teclado.nextInt();

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num4 > mayor) {
            mayor = num4;
        }

        System.out.println("\nEl mayor valor ingresado es: " + mayor);

        teclado.close();
    }
}
