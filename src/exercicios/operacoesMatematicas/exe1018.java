package exercicios.operacoesMatematicas;

import java.util.Scanner;

public class exe1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        int nota100 = valor / 100;
        int resto100 = valor % 100;
        int nota50 = resto100 / 50;
        int resto50 = resto100 % 50;
        int nota20 = resto50 / 20;
        int resto20 = resto50 % 20;
        int nota10 = resto20 / 10;
        int resto10 = resto20 % 10;
        int nota5 = resto10 / 5;
        int resto5 = resto10 % 5;
        int nota2 = resto5 / 2;
        int nota1 = resto5 % 2;

        System.out.printf("%d%n", valor);
        System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00%n", nota1);
    }
}
