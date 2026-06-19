import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {
    public static void main (String[] args){
        Queue<String> filaTortillas = new LinkedList<>();
        filaTortillas.add("Carolina");
        filaTortillas.offer("Itzel");
        filaTortillas.offer("Gustavo");

        System.out.println(filaTortillas);

        while(!filaTortillas.isEmpty()){
            System.out.println(filaTortillas);
            filaTortillas.poll();
        }

        Queue<Integer> id = new PriorityQueue<>();
        id.add(30);
        id.add(15);
        id.add(5);
        id.add(60);
        System.out.println(id);

    }
}
