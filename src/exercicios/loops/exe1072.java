package exercicios.loops;

import java.util.Scanner;

public class exe1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = scanner.nextInt();
        int in = 0;
        int out = 0;

        for(int i = 0; i < times; i++){
            int n = scanner.nextInt();

            if(n >= 10 && n <= 20){
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);
    }
}
