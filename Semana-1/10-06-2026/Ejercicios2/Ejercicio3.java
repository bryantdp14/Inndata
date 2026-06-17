package Ejercicios2;

import java.util.Scanner;

public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su altura en cm (ej. 175): ");
        int altura = teclado.nextInt();

        System.out.print("Ingrese su salario mensual: ");
        double salario = teclado.nextDouble();

        String clasificacionAltura = "";
        if (altura < 162) {
            clasificacionAltura = "bajo";
        } else if (altura >= 162 && altura <= 172) {
      
            clasificacionAltura = "mediano";
        } else {
            clasificacionAltura = "alto";
        }

        String clasificacionSalario = "";
        if (salario < 8000) {
            clasificacionSalario = "ingreso bajo";
        } else if (salario > 8000 && salario < 20000) {
            clasificacionSalario = "ingreso medio";
        } else {
            clasificacionSalario = "ingreso alto";
        }

        System.out.println("\n--- Resultado de la Clasificación ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Clasificación de altura (" + altura + " cm): Es " + clasificacionAltura);
        System.out.println("Clasificación de salario ($" + salario + "): Tiene " + clasificacionSalario);

        teclado.close();
    }
}
