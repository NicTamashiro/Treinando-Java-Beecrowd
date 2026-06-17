package exercicios.vetores;

import java.util.Scanner;

public class exe1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        int[] arr = new int[casos];

        arr[0] = sc.nextInt();
        int menor = arr[0];

        int posicao = 0;
        for(int i = 1; i < casos; i++){
            arr[i] = sc.nextInt();

            if(arr[i] < menor){
                menor = arr[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}
