public class Variables {
    public static void main(String[] args) {
        /*
        Autor : Bryant A. Dorado
        Fecha : 08-06-2026
        
        */
        // Declaración de variables
        int x= 5, z=10, y=-6;

        System.out.println("Valor de X: " + x + ", Valor de z: " + z + ", Valor de y: " + y);

        x= z + y;
        System.out.println("Valor de x después de la suma: " + x);

        x=x+y;
        System.out.println("Valor de x después de la suma: " + x);

        y=y+z+x;
        System.out.println("Valor de y después de la suma: " + y);

        z=x+5;
        System.out.println("Valor de z después de la suma: " + z);

    }   
}
