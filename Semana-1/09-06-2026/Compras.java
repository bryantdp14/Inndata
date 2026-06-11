import java.util.Scanner;

public class Compras {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos articulos vas a comprar?: ");
        int numeroArticulos = entrada.nextInt();
        double precio , suma=0;

        for (int i = 1; i <= numeroArticulos; i++) {
            System.out.println("Precio del articulo " + i + ": ");
            precio = entrada.nextDouble();
            
            suma += precio;
        }

        System.out.println("Suma total de la compra: $" + suma);

    }
}