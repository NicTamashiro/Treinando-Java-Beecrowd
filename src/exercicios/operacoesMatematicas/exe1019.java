package exercicios.operacoesMatematicas;

import java.util.Scanner;

public class exe1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int horas = n / 3600;
        int restoHoras = n % 3600;
        int minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;
        int segundos = restoMinutos;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }
}
