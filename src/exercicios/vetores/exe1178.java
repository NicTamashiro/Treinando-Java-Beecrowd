package exercicios.vetores;

import java.util.Scanner;

public class exe1178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double[] arr = new double[100];

        arr[0] = n;
        for(int i = 1; i < 100; i++){
            arr[i] = arr[i - 1] / 2;
        }

        for(int i = 0; i < 100; i++){
            System.out.printf("N[%d] = %.4f%n", i,arr[i]);
        }
    }
}
