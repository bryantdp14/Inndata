import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumnos {
    
    public static void main(String[] args) {
        String nombre;
        List <String> alumnos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
       

        System.out.println("Cuantos alumnos quieres agregar");
        int numAlumnos = entrada.nextInt();
        entrada.nextLine();
        for(int i=0; i < numAlumnos; i++){
            
            System.out.println("Nombre del alumno");
            nombre = entrada.nextLine();

            alumnos.add(nombre);
        }

        System.out.println(alumnos);

        alumnos.add(0,"fabian");

        System.out.println(alumnos);
        System.out.println("El nombre del inidice 2 es:"+ alumnos.get(1));


        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
         numeros.add(10);
          numeros.add(15);
        for(Integer num: numeros){
            System.out.println(num.MAX_VALUE);
        }
    }
}
