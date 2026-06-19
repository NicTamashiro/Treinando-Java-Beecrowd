package exercicios.matrizes;

import java.util.Scanner;

public class exe1534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int n = sc.nextInt();

            int inicio = 0;
            int fim = 1;

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(j == n - fim) System.out.print("2");
                    else if(j == inicio) System.out.print("1");
                    else System.out.print("3");
                }
                System.out.println();
                inicio++;
                fim++;
            }
        }
    }
}
