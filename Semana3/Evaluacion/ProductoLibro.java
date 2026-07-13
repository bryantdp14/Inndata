public class ProductoLibro extends ProductoAbstracto {
    private String autor;
    private int numeroPaginas;

    public ProductoLibro(String nombre, double precio, String codigo, String descripcion, String autor, int numeroPaginas) {
        super(nombre, precio, codigo, descripcion);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void mostrarProducto() {
        System.out.println("=== Libro ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Precio: $" + precio);
        System.out.println("Descripción: " + descripcion);
        System.out.println("-------------");
    }
}
