package exercicios.vetores;

import java.util.Scanner;

public class exe1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int n = sc.nextInt();
        arr[0] = n;

        for(int i = 1; i < 10; i++){
            arr[i] = arr[i-1]*2;
        }

        for(int i = 0; i < 10; i++) {
            System.out.printf("N[%d] = %d%n", i, arr[i]);
        }
    }
}
