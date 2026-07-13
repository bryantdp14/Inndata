import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private String nombre;
    private List<Categoria> listaCategorias;

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.listaCategorias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCategoria(Categoria categoria) {
        listaCategorias.add(categoria);
    }

    public void mostrarInventario() {
        System.out.println("=== Inventario de la Librería: " + nombre + " ===");
        for (Categoria cat : listaCategorias) {
            System.out.println(">> Categoría: " + cat.getNombre());
            for (Producto p : cat.getListaProductos()) {
                p.mostrarProducto();
            }
        }
        System.out.println("==========================================");
    }
}
