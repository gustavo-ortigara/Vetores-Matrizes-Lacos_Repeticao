import java.util.Random;

public class Atividade_Matrizes02 {
    public static void main(String[] args) {

        int linha = 4;
        int coluna = 4;
        Random numeros = new Random();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeros.nextInt(100);

            }

        }

        System.out.println("\nA matriz preenchida é:");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nOs números da diagonal são");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }


    }
}
