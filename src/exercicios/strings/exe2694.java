package exercicios.strings;

import java.util.Scanner;

public class exe2694 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String palavra = sc.nextLine();

            int soma = 0;
            int num = 0;
            boolean lendoNumero = false;

            for(int j = 0; j < palavra.length(); j++){
                char c = palavra.charAt(j);
                if(c >= '0' && c <= '9'){
                    num = num * 10 + (c - '0');
                    lendoNumero = true;
                } else {
                    if(lendoNumero){
                        soma += num;
                        num = 0;
                        lendoNumero = false;
                    }
                }
            }
            if(lendoNumero){
                soma+=num;
            }
            System.out.println(soma);
        }
    }
}
