package EjerciciosColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercisio2 {

    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        List<String> textos = new ArrayList<>();

        System.out.println("Ingresa una cadena y (escribe Salir)");

        while(true){
            String texto= entrada.nextLine();
            if (texto.equals("Salir")){
                break;
            }
            textos.add(texto);
        }

        Collections.reverse(textos);

        for(String palabra: textos){
            System.out.println(palabra);
        }

        entrada.close();


    }
    
}
