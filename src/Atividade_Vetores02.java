import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade_Vetores02 {
    public static void main(String[] args) {

        int[] numeros = new int[15];

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe " + numeros.length + " numeros: ");
        for (int i=0; i<numeros.length; i++) {
            System.out.println((i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (int n : numeros) {
            if (n % 2 == 0){
                numerosPares.add(n);
            }else{
                numerosImpares.add(n);
            }
        }

        System.out.println("Os numeros pares são " + numerosPares + " os numeros impares sao " +  numerosImpares);

        sc.close();


    }
}
