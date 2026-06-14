package exercicios.condicionais;

import java.util.Scanner;

public class exe1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.next(); // "Dia"
        int diaInicio = scanner.nextInt();
        int hIni = scanner.nextInt(); scanner.next(); // ":"
        int mIni = scanner.nextInt(); scanner.next();
        int sIni = scanner.nextInt();

        scanner.next(); // "Dia"
        int diaFim = scanner.nextInt();
        int hFim = scanner.nextInt(); scanner.next();
        int mFim = scanner.nextInt(); scanner.next();
        int sFim = scanner.nextInt();

        // converte tudo para segundos
        long inicio = ((long) diaInicio * 86400) + (hIni * 3600) + (mIni * 60) + sIni;
        long fim    = ((long) diaFim    * 86400) + (hFim * 3600) + (mFim * 60) + sFim;

        long diff = fim - inicio;

        long dias    = diff / 86400;
        diff %= 86400;
        long horas   = diff / 3600;
        diff %= 3600;
        long minutos = diff / 60;
        long segundos = diff % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}