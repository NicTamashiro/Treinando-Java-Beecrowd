package exercicios.matrizes;

import java.util.Scanner;

public class exe1803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String linha0 = sc.nextLine();
        String linha1 = sc.nextLine();
        String linha2 = sc.nextLine();
        String linha3 = sc.nextLine();

        int totalColunas = linha0.length();

        int[] numeros = new int[totalColunas];
        for(int i = 0; i < totalColunas; i++){
            String numStr = "" + linha0.charAt(i) + linha1.charAt(i) + linha2.charAt(i) + linha3.charAt(i);
            numeros[i] = Integer.parseInt(numStr);
        }

        int F = numeros[0];
        int L = numeros[totalColunas - 1];

        StringBuilder mensagem = new StringBuilder();
        for(int i = 1; i < totalColunas - 1; i++){
            int Mi = numeros[i];
            int Ci = (F * Mi + L) % 257;
            mensagem.append((char) Ci);
        }

        System.out.println(mensagem.toString());
    }
}
