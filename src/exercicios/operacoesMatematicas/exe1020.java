package exercicios.operacoesMatematicas;

import java.util.Scanner;

public class exe1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ano = n / 365;
        int restoAnos = n % 365;
        int mes = restoAnos / 30;
        int restoMes = restoAnos % 30;
        int dias = restoMes;

        System.out.printf("%d ano(s)%n", ano);
        System.out.printf("%d mes(es)%n", mes);
        System.out.printf("%d dia(s)%n", dias);
    }
}
