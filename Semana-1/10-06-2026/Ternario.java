import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es tu calificacion : ");
        double calificacion = entrada.nextDouble();
        String resultado = (calificacion >= 6.0) ? "Aprobado" : "Reprobado";
        System.out.println("Tu resultado es: " + resultado);    
        entrada.close();
    }
}
