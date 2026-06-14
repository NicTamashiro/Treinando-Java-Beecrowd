package exercicios.condicionais;

import java.util.Scanner;

public class exe2344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota= scanner.nextInt();

        if(nota == 0){
            System.out.println("E");
        } else if(nota > 0 && nota <= 35){
            System.out.println("D");
        } else if(nota > 35 && nota <= 60){
            System.out.println("C");
        } else if(nota > 60 && nota <= 85){
            System.out.println("B");
        } else{
            System.out.println("A");
        }
    }
}
