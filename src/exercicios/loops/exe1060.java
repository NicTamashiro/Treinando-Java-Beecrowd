package exercicios.loops;

import java.util.Scanner;

public class exe1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pos = 0;

        for(int i = 0; i < 6; i++){
            double n = scanner.nextDouble();

            if(n > 0){
                pos++;
            }
        }

        System.out.printf("%d valores positivos%n", pos);
    }

}
