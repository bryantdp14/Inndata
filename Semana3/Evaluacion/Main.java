public class Main {
    public static void main(String[] args) {
        // 1. Instanciar al menos tres productos diferentes
        ProductoLibro libro1 = new ProductoLibro("Cien años de soledad", 25.50, "LIB001", "Novela de Gabriel García Márquez", "Gabriel García Márquez", 417);
        ProductoLibro libro2 = new ProductoLibro("El señor de los anillos", 35.00, "LIB002", "Fantasía épica", "J.R.R. Tolkien", 1200);
        ProductoRevista revista1 = new ProductoRevista("National Geographic", 5.99, "REV001", "Revista de ciencia y naturaleza", 202, "Octubre");

        // 2. Crear al menos dos categorías
        Categoria catFiccion = new Categoria("Ficción");
        Categoria catCiencias = new Categoria("Ciencias");

        // 3. Agregar productos a la categoría
        catFiccion.agregarProducto(libro1);
        catFiccion.agregarProducto(libro2);
        catCiencias.agregarProducto(revista1);

        // 4. Crear una librería y agregar categorías
        Libreria miLibreria = new Libreria("Librería Central");
        miLibreria.agregarCategoria(catFiccion);
        miLibreria.agregarCategoria(catCiencias);

        // 5. Crear inventario genérico para almacenar productos
        Inventario<Producto> inventarioGeneral = new Inventario<>();
        inventarioGeneral.agregarItem(libro1);
        inventarioGeneral.agregarItem(libro2);
        inventarioGeneral.agregarItem(revista1);

        // 6. Mostrar el inventario al final
        System.out.println("--- Mostrando a través del método de Librería ---");
        miLibreria.mostrarInventario();

        System.out.println("\n--- Mostrando a través del Inventario Genérico ---");
        inventarioGeneral.mostrarInventario();
    }
}
