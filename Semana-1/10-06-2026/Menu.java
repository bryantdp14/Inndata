import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
            a) Lectura
            b) Peliculas
            c) Musica
                
                """);
            System.out.println("Seleccione una opcion: ");

            String opcion = entrada.next().charAt(0) + ""; // Simulamos la selección del usuario
            switch (opcion.toLowerCase()) {
                case "a":
                    System.out.println("Has seleccionado Lectura");
                    break;
                case "b":
                    System.out.println("Has seleccionado Peliculas");
                    break;
                case "c":
                    System.out.println("Has seleccionado Musica");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        

    }
}
