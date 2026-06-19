package EjercicioMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map <String,String> datos = new LinkedHashMap<>();
        String dato;

        System.out.println("Ingresa tu nombre");
        datos.put("Nombre", dato = entrada.next());
        System.out.println("Ingresa tu edad");
        datos.put("Edad", dato = entrada.next());
        System.out.println("Ingresa tu correo");
        datos.put("Correo", dato = entrada.next());
        System.out.println("Ingresa tu sexo");
        datos.put("Sexo", dato = entrada.next());

        System.out.println(datos);

        System.out.println("los datos de "+ datos.get("Nombre") + " son su edad " + datos.get("Edad")+ " son su correo " + datos.get("Correo")+ " son su sexo " + datos.get("Sexo"));
        

    }
    

}

