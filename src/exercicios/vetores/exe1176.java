package exercicios.vetores;

import java.util.Scanner;

public class exe1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < 61; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        int testes = sc.nextInt();

        for(int i = 0;i < testes; i++){
            int n = sc.nextInt();
            System.out.printf("Fib(%d) = %d%n", n, fib[n]);
        }
    }
}
