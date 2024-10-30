package exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNumber = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int K2 = 0;
        int everest = 0;

        for (int i = 0; i < groupNumber; i++) {
            int alpinists = Integer.parseInt(scanner.nextLine());

            if (alpinists <= 5) {
                musala += alpinists;
            } else if (alpinists <= 12) {
                montblanc += alpinists;
            } else if (alpinists <= 25) {
                kilimanjaro += alpinists;
            } else if (alpinists <= 40) {
                K2 += alpinists;
            } else {
                everest += alpinists;
            }
        }

        int allAlpinists = musala + montblanc + kilimanjaro + K2 + everest;

        double percentMusala = (double) musala / allAlpinists * 100;
        double percentMontblanc = (double) montblanc / allAlpinists * 100;
        double percentKilimanjaro = (double) kilimanjaro / allAlpinists * 100;
        double percentK2 = (double) K2 / allAlpinists * 100;
        double percentEverest = (double) everest / allAlpinists * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMontblanc);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);
    }
}
