import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String palabra = teclado.nextLine();

        System.out.print("La palabra invertida es: ");
        
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
     

        teclado.close();
    }
}
