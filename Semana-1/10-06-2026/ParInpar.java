import java.util.Scanner;

public class ParInpar {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        while (numero > 0) {
  
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par."); 

            } else {
                System.out.println("El número " + numero + " es impar.");
            }
            break;
        }
      
    }
}
