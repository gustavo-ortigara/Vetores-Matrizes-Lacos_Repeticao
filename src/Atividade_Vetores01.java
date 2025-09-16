import java.util.Scanner;

public class Atividade_Vetores01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Informe 10 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + "º número");
            numeros[i] = sc.nextInt();
        }

        Integer posicaoMaior = null;
        Integer posicaoMenor = null;

        for (int i = 0; i < numeros.length; i++) {

            if (posicaoMenor == null) {
                posicaoMenor = numeros[i];
                posicaoMaior = numeros[i];
            } else {

                if (numeros[i] > posicaoMaior) {
                    posicaoMaior = numeros[i];
                }

                if (numeros[i] < posicaoMenor) {
                    posicaoMenor = numeros[i];

                }
            }

        }

        System.out.println("O maior número digitado foi " + posicaoMaior + " e o menor número digitado foi " + posicaoMenor);

    }
}