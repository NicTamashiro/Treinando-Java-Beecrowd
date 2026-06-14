package exercicios.condicionais;

import java.util.Scanner;

public class exe1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int n = (int)(valor * 100 + 0.5);

        int nota100 = n / 10000; n %= 10000;
        int nota50 = n / 5000; n %= 5000;
        int nota20 = n / 2000; n %= 2000;
        int nota10 = n / 1000; n %= 1000;
        int nota5 = n / 500; n %= 500;
        int nota2 = n / 200; n %= 200;
        int moeda1 = n / 100; n %= 100;
        int moeda50 = n / 50; n %=50;
        int moeda25 = n / 25; n %=25;
        int moeda10 = n / 10; n %=10;
        int moeda005 = n / 5; n %=5;
        int moeda001 = n;

        System.out.printf("NOTAS:%n");
        System.out.printf("%d nota(s) de R$ 100.00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50.00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20.00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10.00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5.00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2.00%n", nota2);

        System.out.printf("MOEDAS:%n");
        System.out.printf("%d moeda(s) de R$ 1.00%n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moeda50);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moeda25);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moeda10);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moeda005);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moeda001);
    }
}
