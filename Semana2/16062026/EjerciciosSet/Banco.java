package EjerciciosSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Set<String> cuentasExistentes = new HashSet<>();
        
        System.out.print("Ingresa el número de cuenta que deseas crear: ");
        String numeroCuentaNuevo = entrada.nextLine();

        
        System.out.print("Nombre del titular: ");
        String nombre = entrada.nextLine();

        System.out.print("Apellido del titular: ");
        String apellido = entrada.nextLine();

        System.out.print("Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); 

        System.out.print("Dirección: ");
        String direccion = entrada.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = entrada.nextDouble();
        entrada.nextLine(); 

        System.out.print("Tipo de cuenta (Ahorro/Corriente): ");
        String tipoCuenta = entrada.nextLine();

        cuentasExistentes.add(numeroCuentaNuevo);

        System.out.println("Cuenta creada exitosamente");
        System.out.println("Titular: " + nombre + " " + apellido + " | Dirección: " + direccion);
        System.out.println("Cuenta N°: " + numeroCuentaNuevo + " | Tipo: " + tipoCuenta + " | Saldo: $" + saldo);
        

        entrada.close();
    }
}
