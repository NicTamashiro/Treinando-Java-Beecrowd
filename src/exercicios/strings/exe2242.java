package exercicios.strings;

import java.util.Scanner;

public class exe2242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = sc.next();

        StringBuilder vogais = new StringBuilder();
        for(int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vogais.append(c);
            }
        }

        String v = vogais.toString();
        String reverso = vogais.reverse().toString();

        if(v.equals(reverso)){
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
