package exercicios.loops;

import java.util.Scanner;

public class exe1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", i, n, i*n);
        }
    }
}
