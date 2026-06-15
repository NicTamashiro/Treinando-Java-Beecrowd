package exercicios.loops;

import java.util.Scanner;

public class exe1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 100; i++){
            int n = scanner.nextInt();

            if(n > maior){
                maior = n;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
