import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Cual es su porcentaje de asistencia: ");
        int asistencia = entrada.nextInt();     
        System.out.println("Cual es su calificacion: ");
        double  calificacion = entrada.nextDouble();

        if (asistencia >= 75 && calificacion >= 6.0) {
            System.out.println("Felicidades " + nombre + ", has aprobado el curso.");
        } else {
            System.out.println("Lo siento " + nombre + ", no has aprobado el curso.");
        }

    }

}
