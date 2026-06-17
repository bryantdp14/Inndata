package Ejercicios2;
import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) {
        System.out.println("Validador si puedes trbajar");

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();
        System.out.println("¿que sexo eres? (H/M)");
        char sexo = sc.next().charAt(0);
        
        if (sexo == 'H' || sexo == 'h') {
            if (edad >= 18 && edad <= 68) {
                System.out.println("Puedes trabajar");
            } else {
                System.out.println("No puedes trabajar");
            }
        } else if (sexo == 'M' || sexo == 'm') {
            if (edad >= 18 && edad <= 60) {
                System.out.println("Puedes trabajar");
            } else {
                System.out.println("No puedes trabajar");
            }
        } else {
            System.out.println("Sexo no válido");
        }
    } 
}
