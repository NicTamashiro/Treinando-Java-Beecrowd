package exercicios.strings;

import java.util.Scanner;

public class exe2760 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String linha0 = sc.nextLine();
        String linha1 = sc.nextLine();
        String linha2 = sc.nextLine();

        System.out.printf("%s%s%s%n", linha0, linha1, linha2);
        System.out.printf("%s%s%s%n", linha1, linha2, linha0);
        System.out.printf("%s%s%s%n", linha2, linha0, linha1);
        System.out.printf("%.10s%.10s%.10s%n", linha0, linha1, linha2);
    }
}
