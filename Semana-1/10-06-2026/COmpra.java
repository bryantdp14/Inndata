import java.util.Scanner;

public class COmpra {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinero = 2000;

        while (dinero > 0) {
            System.out.println("¿cuantos aticulos quieres comprar? ");
            double precio = sc.nextDouble();

            if (precio > dinero) {
                System.out.println("No tienes suficiente dinero para comprar " );
              
            } else {
                  dinero -= precio;
                System.out.println("Has comprado El articulo. Dinero restante: " + precio);
                System.out.println("te queda un totald de " + dinero);
            }
        }
    }
}
