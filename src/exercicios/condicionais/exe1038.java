package exercicios.condicionais;

import java.util.Scanner;

public class exe1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int qtd = scanner.nextInt();

        switch (codigo){
            case 1:
                System.out.printf("Total: R$ %.2f%n", 4.00*qtd);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f%n", 4.50*qtd);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f%n", 5.00*qtd);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f%n", 2.00*qtd);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f%n", 1.50*qtd);
                break;
        }
    }
}
