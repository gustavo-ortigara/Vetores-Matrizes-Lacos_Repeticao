import java.util.Scanner;

public class Atividade_Matrizes01 {
    public static void main(String[] args) {

        int linha = 3;
        int coluna = 3;

        int[][] matriz = new int[linha][coluna];

        int totalMatriz = matriz.length * matriz[0].length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite " + totalMatriz + " numeros: ");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = sc.nextInt();

            }

        }

        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
