import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private List<Producto> listaProductos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.listaProductos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public void mostrarCategoria() {
        System.out.println("Categoría: " + nombre);
        System.out.println("Cantidad de productos: " + listaProductos.size());
    }
}
