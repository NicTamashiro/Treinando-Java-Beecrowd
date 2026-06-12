package exercicios.introducao;

import java.util.Scanner;

public class exe1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double volume = (4.0/3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

    }
}
