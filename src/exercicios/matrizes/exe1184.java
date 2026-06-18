package exercicios.matrizes;

import java.util.Scanner;

public class exe1184 {

    static double calculaSoma(double[][] mat){
        double soma = 0;

        for(int i = 1; i < 12; i++){
            for(int j = 0; j < i; j++){
                soma += mat[i][j];
            }
        }

        return soma;
    }

    static double calculaMedia(double[][] mat){
        double soma = calculaSoma(mat);

        return soma / 66;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] mat = new double[12][12];
        char op = sc.next().charAt(0);

        for(int i = 0; i < 12; i++){
            for(int j =0; j < 12; j++){
                mat[i][j] = sc.nextDouble();
            }
        }

        if(op == 'S'){
            System.out.printf("%.1f%n", calculaSoma(mat));
        } else {
            System.out.printf("%.1f%n", calculaMedia(mat));
        }
    }
}
