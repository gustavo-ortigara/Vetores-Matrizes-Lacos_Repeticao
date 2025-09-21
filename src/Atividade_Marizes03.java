import java.util.Scanner;

public class Atividade_Marizes03 {
    public static void main(String[] args) {

        int linha = 3;
        int coluna = 3;

        int[][] matriz = new int[linha][coluna];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores da matriz: ");
        for (int i =0; i <matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = sc.nextInt();

            }
        }

        System.out.println("Os valores informados compõe a matriz da seguinte forma: ");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("A soma dos valores de cada linha é o seguinte: ");
        for (int i = 0; i < linha; i++){
            int somaLinha = 0;
            for (int j =0; j <matriz[i].length; j++){
                somaLinha += matriz[i][j];

            }
            System.out.print(somaLinha + ", ");
        }

        System.out.println();

        System.out.println("A soma dos valores de cada coluna é o seguinte: ");
        for (int j = 0; j < coluna; j++){
            int somaColuna = 0;
            for (int i = 0; i < linha; i++){
                somaColuna += matriz[i][j];

            }
            System.out.print(somaColuna + ", ");
        }


    }
}
