package exercicios.condicionais;

import java.util.Scanner;

public class exe1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;

        for(int i = 0; i < 5; i++){
            int n = scanner.nextInt();
            if(n % 2 == 0){
                pares++;
            }
        }

        System.out.printf("%d valores pares%n", pares);
    }
}
