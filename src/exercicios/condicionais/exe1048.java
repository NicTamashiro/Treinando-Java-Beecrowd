package exercicios.condicionais;

import java.util.Scanner;

public class exe1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        double salario, reajuste;
        int percentual;

        if (valor >= 0 && valor <= 400){
            percentual = 15;
            reajuste = valor * 0.15;
            salario = valor * 1.15;
        } else if(valor > 400 & valor <= 800){
            percentual = 12;
            reajuste = valor * 0.12;
            salario = valor * 1.12;
        } else if(valor > 800 && valor <= 1200){
            percentual = 10;
            reajuste = valor * 0.10;
            salario = valor * 1.10;
        } else if(valor > 1200 && valor <= 2000){
            percentual = 7;
            reajuste = valor * 0.07;
            salario = valor * 1.07;
        } else {
            percentual = 4;
            reajuste = valor * 0.04;
            salario = valor * 1.04;
        }

        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%%n", percentual);

    }
}
