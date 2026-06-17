package EjerciciosArreglos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = teclado.nextLine();

        char[] caracteres = palabra.toCharArray();


        for (int i = 0; i < caracteres.length; i++) {
            char letra = caracteres[i];
            
            // Evaluamos si es vocal (incluyendo mayúsculas y minúsculas)
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.print(letra + " ");
            }
        }
        System.out.println(); // Salto de línea estético

        teclado.close();
    }
}
