import java.util.Scanner;

public class Nombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }   
        System.out.println("Los nombres ingresados son:" + nombres);
            for (String nombre : nombres) {
                System.out.println(nombre);
            }
            
    }
    
}
