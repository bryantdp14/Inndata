import java.util.Scanner;

public class Ejercicio {
    
    public static void main(String[] args) {
        
        double x1=0, x2=0, a=0, b=0, c=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c = entrada.nextDouble();   

        x1 = -b - Math.sqrt(Math.pow(b, 2) - 4*a*c) / (2*a);
        x2 = -b + Math.sqrt(Math.pow(b, 2) - 4*a*c) / (2*a);

        System.out.println("Las raíces son: " + x1 + " y " + x2);

    }
}
