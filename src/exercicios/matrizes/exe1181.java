package exercicios.matrizes;

import java.util.Scanner;

public class exe1181 {

    static double calculateSum(int line, double[][] matriz) {
        double sum = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            sum += matriz[line][i];
        }
        return sum;
    }

    static double calculateAve(int line, double[][] matriz) {
        return calculateSum(line, matriz) / 12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        char op = sc.next().charAt(0);
        double[][] matriz = new double[12][12];

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                matriz[i][j] = sc.nextDouble();

        if (op == 'S') {
            System.out.printf("%.1f\n", calculateSum(line, matriz));
        } else {
            System.out.printf("%.1f\n", calculateAve(line, matriz));
        }
    }
}