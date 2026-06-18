package exercicios.strings;

import java.util.Scanner;

public class exe2591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String texto = sc.next();

            int j = 1;

            int g1 = 0;
            char c = texto.charAt(j);
            while(c == 'a'){
                j++;
                c = texto.charAt(j);
                g1++;
            }

            j+=3;

            int g2 = 0;
            c = texto.charAt(j);
            while(c == 'a'){
                j++;
                c = texto.charAt(j);
                g2++;
            }

            System.out.print("k");
            for(j = 0; j < g1*g2; j++){
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
