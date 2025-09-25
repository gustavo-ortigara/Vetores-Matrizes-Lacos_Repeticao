import java.util.Scanner;

public class Atividade_Desaf02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 3;
        int colunas = 2;
        int[][] matriz = new int[linhas][colunas];
        int[][] transposta = new int[colunas][linhas];

        System.out.println("Digite os elementos da matriz 3x2:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nA matriz preenchida é:");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nMatriz Transposta é:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
