package Ejercicios;

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   
        double sueldo = 0.0;
        int horas = 8 ,dias = 5, semanas = 4, meses = 1;
        double inpuesto= .18;
        System.out.println("Ingrese el sueldo por hora: ");
        sueldo = entrada.nextDouble();
        double sueldoMensual = sueldo * horas * dias * semanas * meses;
        double sueldoNeto = sueldoMensual - (sueldoMensual * inpuesto);
        System.out.println("El sueldo mensual es: " + sueldoMensual);
        System.out.println("El sueldo neto es: " + sueldoNeto);
        System.out.println("El sueldo por dia es: " + (sueldo * horas));
        System.out.println("El sueldo por semana es: " + (sueldo * horas * dias));

    }
}
