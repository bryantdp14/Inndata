package Ejercicios2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Seleccione el piso al que desea ir: ");
        int piso = teclado.nextInt();

        teclado.nextLine(); 

        System.out.print("¿Cuenta con credencial de acceso autorizado? (si/no): ");
        String tienePermiso = teclado.nextLine().trim().toLowerCase();

        if (tienePermiso.equals("si")) {
            System.out.println("\n[Acceso Concedido] El elevador se está moviendo...");
            
            switch (piso) {
                case 1:
                    System.out.println("Ha llegado al Piso 1: Recepción y Urgencias.");
                    break;
                case 2:
                    System.out.println("Ha llegado al Piso 2: Pediatría y Maternidad.");
                    break;
                case 3:
                    System.out.println("Ha llegado al Piso 3: Quirófanos y Cuidados Intensivos.");
                    break;
                case 4:
                    System.out.println("Ha llegado al Piso 4: Laboratorios y Rayos X.");
                    break;
                case 5:
                    System.out.println("Ha llegado al Piso 5: Oficinas Administrativas.");
                    break;
                default:
                    System.out.println("Error: El piso ingresado no existe en este hospital.");
                    break;
            }
        } else {
            System.out.println("No tiene los permisos requeridos para usar este elevador.");
        }

        teclado.close();
    }
}
