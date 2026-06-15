package exercicios.loops;

import java.util.Scanner;

public class exe1073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n % 2 == 0) n++;

        for(int i = 2; i < n; i+=2){
            System.out.printf("%d^2 = %d%n", i, i*i);
        }
    }
}
