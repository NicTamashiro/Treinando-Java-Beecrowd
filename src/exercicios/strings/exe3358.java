package exercicios.strings;

import java.util.Scanner;

public class exe3358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0;i < n; i++){

            String str = sc.nextLine();

            int consecutivas = 0;
            boolean dificil = false;

            for (int j = 0; j < str.length(); j++){
                char c = str.charAt(j);

                boolean ehConsoante = Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c));

                if(ehConsoante){
                    consecutivas++;

                    if(consecutivas >= 3){
                        dificil = true;
                        break;
                    }
                } else {
                    consecutivas = 0;
                }
            }

            if (dificil){
                System.out.println(str + " nao eh facil");
            } else {
                System.out.println(str + " eh facil");
            }

        }
    }
}
