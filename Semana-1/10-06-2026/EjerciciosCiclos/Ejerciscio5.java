package EjerciciosCiclos;

import java.util.Scanner;

public class Ejerciscio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final String PIN_CORRECTO = "1234";
        boolean autenticado = false;
        int intentos = 3;
        
        double saldo = 1000.0; 

        System.out.println("=== BIENVENIDO AL BANCO ===");

        while (intentos > 0 && !autenticado) {
            System.out.print("Ingrese su PIN de seguridad: ");
            String pinIngresado = teclado.nextLine();

            if (pinIngresado.equals(PIN_CORRECTO)) {
                autenticado = true;
                System.out.println("Autenticación exitosa.");
            } else {
                intentos--;
                System.out.println("PIN incorrecto. Intentos restantes: " + intentos);
            }
        }

        if (!autenticado) {
            System.out.println("Cuenta bloqueada por seguridad. Agotó sus 3 intentos.");
        } else {
            int opcion = 0;
            
            while (opcion != 5) {
                System.out.println("--- MENU CAJERO AUTOMATICO ---");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Depositar Dinero");
                System.out.println("3. Retirar Dinero");
                System.out.println("4. Pagar Servicios");
                System.out.println("5. Terminar Operación");
                System.out.print("Seleccione una opcion: ");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.printf("Su saldo actual es: \n", saldo);
                        break;

                    case 2:
                        System.out.print("Ingrese la cantidad a depositar: $");
                        double deposito = teclado.nextDouble();
                        if (deposito > 0) {
                            saldo += deposito;
                            System.out.printf("Depósito exitoso. Nuevo saldo: $%.2f\n", saldo);
                        } else {
                            System.out.println("Cantidad no válida.");
                        }
                        break;

                    case 3:
                        System.out.print("Ingrese la cantidad a retirar: $");
                        double retiro = teclado.nextDouble();
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            System.out.printf("Retiro exitoso. Nuevo saldo: $%.2f\n", saldo);
                        } else if (retiro > saldo) {
                            System.out.println("Fondos insuficientes.");
                        } else {
                            System.out.println("Cantidad no válida.");
                        }
                        break;

                    case 4:
                        System.out.println("Servicios disponibles: 1. Luz ($150) | 2. Agua ($80) | 3. Internet ($250)");
                        System.out.print("Seleccione el servicio a pagar: ");
                        int servicio = teclado.nextInt();
                        double costoServicio = 0;
                        String nombreServicio = "";

                        if (servicio == 1) { costoServicio = 150; nombreServicio = "Luz"; }
                        else if (servicio == 2) { costoServicio = 80; nombreServicio = "Agua"; }
                        else if (servicio == 3) { costoServicio = 250; nombreServicio = "Internet"; }

                        if (costoServicio > 0) {
                            if (saldo >= costoServicio) {
                                saldo -= costoServicio;
                                System.out.printf("Pago de %s realizado. Nuevo saldo: $%.2f\n", nombreServicio, saldo);
                            } else {
                                System.out.println("Saldo insuficiente para pagar este servicio.");
                            }
                        } else {
                            System.out.println("Servicio no válido.");
                        }
                        break;

                    case 5:
                        System.out.println("Retire su tarjeta. ¡Gracias por usar nuestro cajero!");
                        break;

                    default:
                        System.out.println("Opción no válida del menú.");
                        break;
                }
            }
        }

        teclado.close();
    }
}
