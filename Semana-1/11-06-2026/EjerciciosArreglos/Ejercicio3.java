import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número para la posición [" + i + "]: ");
            numeros[i] = teclado.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número MAYOR es: " + mayor);
        System.out.println("El número MENOR es: " + menor);

        teclado.close();
    }
}
