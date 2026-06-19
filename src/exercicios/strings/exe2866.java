package exercicios.strings;

import java.util.Scanner;

public class exe2866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){

            String texto = sc.nextLine();
            StringBuilder output = new StringBuilder();

            for(int j = 0; j < texto.length(); j++) {
                char c = texto.charAt(j);
                if(Character.isLowerCase(c)){
                    output.append(c);
                }
            }

            System.out.println(output.reverse().toString());
        }
    }
}
