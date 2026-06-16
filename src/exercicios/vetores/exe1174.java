package exercicios.vetores;

import java.util.Scanner;

public class exe1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[100];

        for(int i = 0;i < 100; i++){
            arr[i] = sc.nextDouble();
        }

        for(int i = 0; i < 100; i++){
            if(arr[i] <= 10){
                System.out.printf("A[%d] = %.1f%n", i, arr[i]);
            }
        }

    }
}
