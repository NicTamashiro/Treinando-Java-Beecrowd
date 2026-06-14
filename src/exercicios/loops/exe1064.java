package exercicios.loops;

import java.util.Scanner;

public class exe1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int pos = 0;

        for(int i = 0; i < 6; i++){
            double n = scanner.nextDouble();
            if(n > 0) {
                pos++;
                soma += n;
            }
        }

        System.out.printf("%d valores positivos%n", pos);
        System.out.printf("%.1f%n", soma/pos);
    }
}
