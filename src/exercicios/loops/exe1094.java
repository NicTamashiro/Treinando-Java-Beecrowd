package exercicios.loops;

import java.util.Scanner;

public class exe1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        int casos = scanner.nextInt();

        for(int i = 0; i < casos; i++){
            int qtd = scanner.nextInt();
            char tipo = scanner.next().charAt(0);

            if(tipo == 'C') coelhos += qtd;
            else if(tipo == 'R') ratos += qtd;
            else sapos += qtd;
        }
        total = coelhos + ratos + sapos;

        System.out.printf("Total: %d cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", coelhos);
        System.out.printf("Total de ratos: %d%n", ratos);
        System.out.printf("Total de sapos: %d%n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", (coelhos / (double)total) * 100.0);
        System.out.printf("Percentual de ratos: %.2f %%%n", (ratos / (double)total) * 100.0);
        System.out.printf("Percentual de sapos: %.2f %%%n", (sapos / (double)total) * 100.0);
    }
}
