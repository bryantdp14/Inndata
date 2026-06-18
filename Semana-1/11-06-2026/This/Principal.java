
public class Principal {
    public static void main(String[] args) {

        Productos producto1 = new Productos(1, "JABON DE BAÑO", "LAVANDA");
        
        System.out.println(producto1.id);

        Productos productoNuevo = new Productos();
        productoNuevo.id = 2;
        productoNuevo.nombre = "Shampoo Savile";
        productoNuevo.descripcion = "Rizos definidos";

        System.out.println(productoNuevo);


    }
}
