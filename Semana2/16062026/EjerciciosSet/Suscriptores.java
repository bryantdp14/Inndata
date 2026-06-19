package EjerciciosSet;

import java.util.Scanner;

class Suscriptores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuarioRegistrado = "bryant";
        String contrasenaRegistrada = "123456";
        String fechaInicio = "19-06-2026";
        boolean estaActivo = true;

        System.out.print("Ingresa usuario: ");
        String usuarioIngresado = entrada.nextLine();
        
        System.out.print("Ingresa contraseña: ");
        String contrasenaIngresada = entrada.nextLine();

        if (usuarioIngresado.equals(usuarioRegistrado) && contrasenaIngresada.equals(contrasenaRegistrada)) {
            System.out.println("¡Acceso concedido!");
            System.out.println("Fecha de inicio: " + fechaInicio);
            System.out.println("¿Cuenta activa?: " + (estaActivo ? "Sí" : "No"));
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

        entrada.close();
    }
    
}
