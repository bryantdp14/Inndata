import java.util.Scanner;

public class Errores {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingresa un numero");

            int numero = entrada.nextInt();
        } catch (Exception ex) {
            System.out.println("Ingresa solo numeros");
        }finally{
            System.out.println("Fin del programa no s vemos luego");
        }
        
    }
}
