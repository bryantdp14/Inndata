public class ProductoRevista extends ProductoAbstracto {
    private int numeroEdicion;
    private String mesPublicacion;

    public ProductoRevista(String nombre, double precio, String codigo, String descripcion, int numeroEdicion, String mesPublicacion) {
        super(nombre, precio, codigo, descripcion);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    @Override
    public void mostrarProducto() {
        System.out.println("=== Revista ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edición: " + numeroEdicion + " (" + mesPublicacion + ")");
        System.out.println("Precio: $" + precio);
        System.out.println("Descripción: " + descripcion);
        System.out.println("---------------");
    }
}
