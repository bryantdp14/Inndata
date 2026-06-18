import java.util.Scanner;

public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = teclado.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = teclado.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                        break;
                    case 4:
                        double resDivision = dividir(num1, num2);
                        if (Double.isNaN(resDivision)) {
                            System.out.println("No se puede dividir entre cero.");
                        } else {
                            System.out.println("Resultado de la división: " + resDivision);
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Calculadora finalizada. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida.");
            }
        }
        teclado.close();
    }


    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            return Double.NaN; 
        }
        return a / b;
    }
}
