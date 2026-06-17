package exercicios.vetores;

import java.util.Scanner;

public class exe1179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];

        int contadorPar = 0;
        int contadorImpar = 0;

        for(int i = 0; i < 15; i++){
            int n = sc.nextInt();

            if(n % 2 == 0){
                par[contadorPar] = n;
                contadorPar++;
            } else {
                impar[contadorImpar] = n;
                contadorImpar++;
            }

            if(contadorPar == 5){
                for(int j = 0; j < 5; j++){
                    System.out.printf("par[%d] = %d%n", j, par[j]);
                }
                contadorPar = 0;
            } else if (contadorImpar == 5) {
                for(int j = 0; j < 5; j++){
                    System.out.printf("impar[%d] = %d%n", j, impar[j]);
                }
                contadorImpar = 0;
            }
        }
        for(int i = 0; i < contadorImpar; i++){
            System.out.printf("impar[%d] = %d%n", i, impar[i]);
        }
        for(int i = 0; i < contadorPar; i++){
            System.out.printf("par[%d] = %d%n", i, par[i]);
        }

    }
}
