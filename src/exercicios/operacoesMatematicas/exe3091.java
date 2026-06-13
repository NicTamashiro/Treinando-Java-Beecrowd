package exercicios.operacoesMatematicas;

import java.util.Scanner;

public class exe3091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d%n", a % b);
    }
}
