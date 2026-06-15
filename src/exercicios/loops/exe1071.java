package exercicios.loops;

import java.util.Scanner;

public class exe1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int soma = 0;

        if (x > y){
            int temp = x;
            x = y;
            y = temp;
        }

        for(int i = 1+x; i < y; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
