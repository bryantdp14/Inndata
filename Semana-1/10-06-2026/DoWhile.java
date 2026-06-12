import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuanto dinero tienes para gastar? ");
        double dinero = scanner.nextDouble();

        do {
            System.out.println("¿Cuantos cuesta el articulo que quieres comprar? ");
            double precio = scanner.nextDouble();
            if (precio <= dinero) {
                dinero -= precio;
                System.out.println("Compra realizada. Dinero restante: " + dinero);
            } else {
                System.out.println("No tienes suficiente dinero para comprar este artículo.");
            }
        } while (dinero > 0);
    }
}
