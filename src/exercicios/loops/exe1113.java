package exercicios.loops;

import java.util.Scanner;

public class exe1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x == y) break;

            if(x < y) System.out.println("Crescente");
            else System.out.println("Decrescente");
        }
    }
}
