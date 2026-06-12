package exercicios.introducao;

import java.util.Scanner;

public class exe1014 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.printf("%.3f km/l%n", consumoMedio);
    }
}
