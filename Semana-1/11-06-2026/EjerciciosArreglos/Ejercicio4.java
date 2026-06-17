
public class Ejercicio4 {
    public static void main(String[] args) {
    
        int[] arrayNum = {4, 6, 7, 12, 20, 23, 30, 125, 80, 215};

        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        int[] pares = new int[totalPares];
        int[] impares = new int[totalImpares];

        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                pares[indicePar] = arrayNum[i];
                indicePar++;
            } else {
                impares[indiceImpar] = arrayNum[i];
                indiceImpar++;
            }
        }
        
        System.out.print("Arreglo de PARES: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println(); 

        System.out.print("Arreglo de IMPARES: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
