import java.util.HashMap;
import java.util.Map;

public class Calificaciones{

    public static void main(String[] args) {
        Map<String,Double> listado = new HashMap<>();
        listado.put("Andrea", 8.5);
        listado.put("Viry", 9.6);
        listado.put("Raul", 8.3);
        System.out.println(listado);

        for(String nombre: listado.keySet()){
            System.out.println("la calificacion de "+ nombre + " es de " + listado.get(nombre));
        }
    }
}
