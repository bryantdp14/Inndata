package Semana2.EvaluacionModulo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            List<Integer> listaNumeros = new ArrayList<>();
            int numero , valor;

            System.out.println("Dime con cuantos numeros deseas iniciar tu evaluacion");
            numero = entrada.nextInt();

            for(int i=0; i< numero; i++){
                System.out.println("Dame un numero");
                valor = entrada.nextInt();
                listaNumeros.add(valor);
            }
            System.out.println(listaNumeros);

            int sumatoria = listaNumeros.stream()
                            .filter(n -> n > 10)
                            .mapToInt(n -> n) 
                            .sum();

            System.out.println("Sumatoria: "+ sumatoria);

            int multiplicacion = listaNumeros.stream()
                            .filter(n -> n > 10)
                            .mapToInt(n -> n * 2) 
                            .sum();

            System.out.println("multiplicacion despues del filtrado: "+ multiplicacion);


        } catch (Exception ex) {
            System.out.println("Ingresa solo numeros");
        }finally{
            System.out.println("Fin del programa no s vemos luego");
        }


    }
}
