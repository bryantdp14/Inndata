import java.util.Scanner;

public class FuncionMetodo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();
        int resultado = sumar(num1, num2);

        System.out.println("La suma es: " + resultado);
        entrada.close();

        FuncionMetodo funcion = new FuncionMetodo();
        funcion.suma(num1, num2);

        sumar("Sumnado varios numeros", 5.2,3.8,8.4);
        

        
    }

    /// metodo o funcion statico
    
    static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public void suma(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }


    static double sumar (String mensaje, double... numeros){
        System.out.println(mensaje);
        double s=0;
        for(double num: numeros){
            s +=num;
        }
        return s;
    }
}
