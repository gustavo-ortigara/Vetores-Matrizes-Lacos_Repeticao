public class Atividade_Desaf01 {
    public static void main(String[] args) {

        int linha = 5;
        int coluna = 5;
        int[][] matriz = new int[linha][coluna];

        // Preencher a matriz identidade
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Exibir a matriz
        System.out.println("Matriz Identidade 5x5:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
