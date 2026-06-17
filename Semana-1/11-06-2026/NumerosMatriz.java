
public class NumerosMatriz {

    public static void main(String[] args) {

        int [][] numeros = {{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(numeros.length);

        
    }
}
