package EjerciciosCiclos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final String USUARIO_CORRECTO = "admin";
        final String CLAVE_CORRECTO = "pass123";

        boolean loginExitoso = false;
        int intentosRestantes = 3;

        while (intentosRestantes > 0 && !loginExitoso) {
            System.out.print("Ingrese su usuario: ");
            String usuario = teclado.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String clave = teclado.nextLine();

            if (usuario.equals(USUARIO_CORRECTO) && clave.equals(CLAVE_CORRECTO)) {
                loginExitoso = true;
                System.out.println("¡Inicio de sesión correcto!");
            } else {
                intentosRestantes--;
                System.out.println("Credenciales inválidas. Intentos restantes: " + intentosRestantes + "\n");
            }
        }

        if (!loginExitoso) {
            System.out.println("El programa se ha bloqueado. Agotó sus 3 intentos permitidos.");
        } else {
      
            
            System.out.print("Ingrese su peso en kilogramos (ej. 70.5): ");
            double peso = teclado.nextDouble();

            System.out.print("Ingrese su estatura en metros (ej. 1.72): ");
            double estatura = teclado.nextDouble();

            double imc = peso / (estatura * estatura);

            System.out.printf("Su Índice de Masa Corporal (IMC) es: ", imc);

            System.out.print("Estado nutricional: ");
            if (imc < 18.5) {
                System.out.println("Bajo peso");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso normal (Saludable)");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidad");
            }
        }

        teclado.close();
    }
}
