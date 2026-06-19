package exercicios.strings;

import java.util.Scanner;

public class exe1581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < times; i++){
            int qtd = Integer.parseInt(sc.nextLine());

            String primeira = sc.nextLine();
            boolean iguais = true;

            for(int j = 1; j < qtd; j++){
                String atual = sc.nextLine();
                if(!atual.equals(primeira)){
                    iguais = false;
                }
            }

            if(iguais){
                System.out.println(primeira);
            } else {
                System.out.println("ingles");
            }
        }
    }
}
