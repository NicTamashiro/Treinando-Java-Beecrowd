package exercicios.introducao;

import java.util.Scanner;

public class exe1010 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int p1, n1, p2, n2;
        double v1,v2;

        p1 = scanner.nextInt();
        n1 = scanner.nextInt();
        v1 = scanner.nextDouble();
        p2 = scanner.nextInt();
        n2 = scanner.nextInt();
        v2 = scanner.nextDouble();

        double pagar = (n1 * v1) + (n2 * v2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", pagar);
    }
}
