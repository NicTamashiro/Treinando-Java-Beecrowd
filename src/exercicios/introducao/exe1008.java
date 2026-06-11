package exercicios.introducao;

import java.util.Scanner;

public class exe1008 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int horas = scanner.nextInt();
        double valor = scanner.nextDouble();

        double salario = horas * valor;

        System.out.printf("NUMBER = %d%n", num);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
