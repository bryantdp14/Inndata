import java.util.ArrayList;
import java.util.List;

public class Inventario<T> {
    private List<T> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(T item) {
        this.items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void mostrarInventario() {
        System.out.println("Inventario contiene " + items.size() + " elementos.");
        for (T item : items) {
            if (item instanceof Producto) {
                ((Producto) item).mostrarProducto();
            } else {
                System.out.println(item.toString());
            }
        }
    }
}
