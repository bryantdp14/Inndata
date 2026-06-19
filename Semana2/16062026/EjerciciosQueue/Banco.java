package EjerciciosQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Queue<String> perosnas = new LinkedList<>();
        perosnas.add("Carolina");
        perosnas.add("Itzel");
        perosnas.add("Gustavo");
        perosnas.offer("Alfredo");

         while(!perosnas.isEmpty()){
            System.out.println("Se atendio a: "+perosnas.peek());
            perosnas.poll();
        }

    }
}
