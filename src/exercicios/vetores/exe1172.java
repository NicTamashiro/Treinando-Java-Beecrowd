package exercicios.vetores;

import java.util.Scanner;

public class exe1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(arr[i] <= 0){
                arr[i] = 1;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.printf("X[%d] = %d%n", i, arr[i]);
        }
    }
}
