import java.util.HashSet;
import java.util.Iterator;

public class EjemploSet {
    public static void main(String[] args){
        HashSet <String> nombres = new HashSet<>();
        nombres.add("Esmeralda");
        nombres.add("Diego");
        nombres.add("Arturo");

        System.out.println(nombres);

        System.out.println("imprimir con while");
        Iterator siguiente = nombres.iterator();
        while(siguiente.hasNext()){
            System.out.println(siguiente.next());
        }

        System.out.println("imprimir con for");
        for(String nom: nombres){
            System.out.println(nom);
        }




    }
}
