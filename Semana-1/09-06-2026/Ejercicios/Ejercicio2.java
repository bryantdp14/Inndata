package Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        int pesos = 5;
        int ahorro = 0;
        int semana = 7;
        int mes = 30;
        int año = 365;
        int años = 10;
        double rendimiento = 0.20;

        double ahorroSemanal = pesos * semana;
        double ahorroMensual = pesos * mes; 
        double ahorroAnual = pesos * año;
        double ahorro10Años = pesos * año * años;
        double rendimientoSemanal = ahorroMensual * rendimiento;

        System.out.println("Ahorro semanal: " + ahorroSemanal + " pesos");
        System.out.println("Ahorro mensual: " + ahorroMensual + " pesos");
        System.out.println("Ahorro anual: " + ahorroAnual + " pesos");
        System.out.println("Ahorro en 10 años: " + ahorro10Años + " pesos");
        System.out.println("Rendimiento semanal: " + rendimientoSemanal + " pesos");

    }
}
