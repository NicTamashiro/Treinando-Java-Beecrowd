package exercicios.matrizes;

import java.util.Scanner;

public class exe1182 {

    static double calculateSum(int col, double[][] matriz) {
        double sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            sum += matriz[i][col];
        }
        return sum;
    }

    static double calculateAve(int line, double[][] matriz) {
        return calculateSum(line, matriz) / 12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int col = sc.nextInt();
        char op = sc.next().charAt(0);
        double[][] matriz = new double[12][12];

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                matriz[i][j] = sc.nextDouble();

        if (op == 'S') {
            System.out.printf("%.1f\n", calculateSum(col, matriz));
        } else {
            System.out.printf("%.1f\n", calculateAve(col, matriz));
        }
    }
}