import java.util.Scanner;

public class Ejercicio6 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String textoOriginal = teclado.nextLine();

        String texto = textoOriginal.toLowerCase().replace(" ", "");
        
        boolean[] yaImpreso = new boolean[texto.length()];

        System.out.print("Las letras que se repiten son: ");
        boolean existenRepetidas = false;

        for (int i = 0; i < texto.length(); i++) {
            char letraActual = texto.charAt(i);
            
            if (yaImpreso[i]) {
                continue;
            }

            boolean seRepite = false;

            for (int j = i + 1; j < texto.length(); j++) {
                if (letraActual == texto.charAt(j)) {
                    seRepite = true;
                    yaImpreso[j] = true; 
                }
            }

            if (seRepite) {
                System.out.print("'" + letraActual + "' ");
                existenRepetidas = true;
            }
        }

        if (!existenRepetidas) {
            System.out.print("(Ninguna letra se repite)");
        }

        teclado.close();
    }
}
