package exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int boardPreparation = Integer.parseInt(scanner.nextLine());
        double discount = Integer.parseInt(scanner.nextLine());

        double sumPens = pens * 5.80;
        double sumMarkers = markers * 7.20;
        double sumPreparation = boardPreparation * 1.20;
        double discountInPercent = discount / 100;

        double sum = sumPens + sumMarkers + sumPreparation;
        double total = sum - (sum * discountInPercent);

        System.out.println(total);

    }
}
