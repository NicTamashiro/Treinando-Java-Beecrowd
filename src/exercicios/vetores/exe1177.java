package exercicios.vetores;

import java.util.Scanner;

public class exe1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[1000];

        for(int i = 0; i < 1000; i++){
            arr[i] = i % n;
        }
        for(int i = 0; i < 1000; i++){
            System.out.printf("N[%d] = %d%n",i , arr[i]);
        }
    }
}
