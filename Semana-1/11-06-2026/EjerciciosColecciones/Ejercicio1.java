package EjerciciosColecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String var[]){
        Scanner entrada = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int numero, valor;

        System.out.println("Cuantos numeros ingresas a la lista");
        numero = entrada.nextInt();

        for(int i=0; i < numero; i++){
            
            System.out.println("Dame el valor");
            valor = entrada.nextInt();
            numeros.add(valor);
        }
        
        System.out.println("Numeros en la lista"+ numeros);

        suma(numeros);
        promedio(numeros);
        valorMaximo(numeros);
        valorMinimo(numeros);
        

    }

    public static int suma(List<Integer> listaNumeros){
        int resultado=0;

        for(Integer numero: listaNumeros){
            resultado += numero;
        }

        System.out.println("la suma es: "+ resultado);

        return resultado;

    }

    public static double promedio (List<Integer> listaNumeros){
        double promedio=0.0;

        for(Integer numero: listaNumeros){

                    promedio += numero;
        }

        promedio = promedio / listaNumeros.size();

        System.out.println("el promedio es: "+ promedio);

        return promedio;
    }

      public static int valorMaximo (List<Integer> listaNumeros){
        int resultado= Collections.max(listaNumeros);

        System.out.println("el valor maximo es: "+ resultado);

        return resultado;
    }


      public static int valorMinimo (List<Integer> listaNumeros){
        
        
        int resultado= Collections.min(listaNumeros);

        System.out.println("el valor minimo es: "+ resultado);

        return resultado;
    }



    
}
