package exercicios.matrizes;

import java.util.Scanner;

public class exe1435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n == 0) break;

            int[][] matriz = new int[100][100];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int top = i;
                    int bottom = n - 1 - i;
                    int left = j;
                    int right  = n - 1 - j;
                    int menor  = top;
                    if(bottom < menor) menor = bottom;
                    if(left   < menor) menor = left;
                    if(right  < menor) menor = right;
                    matriz[i][j] = menor + 1;
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(j > 0) System.out.print(" ");
                    System.out.printf("%3d", matriz[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
