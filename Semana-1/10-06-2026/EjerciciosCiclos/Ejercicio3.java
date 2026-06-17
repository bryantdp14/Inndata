package EjerciciosCiclos;

import java.util.Scanner;

public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar?: ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Error: La cantidad de números debe ser mayor a 0.");
        } else {
            double suma = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                double numero = teclado.nextDouble();
                suma += numero;
            }

            double promedio = suma / n;

            System.out.println("\n--- Resultados ---");
            System.out.println("Total de números ingresados: " + n);
            System.out.println("Suma total: " + suma);
            System.out.printf("El promedio de los números es: %.2f\n", promedio);
        }

        teclado.close();
    }
}
