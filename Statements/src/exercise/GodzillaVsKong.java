package exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extraCount = Integer.parseInt(scanner.nextLine());
        double pricePerCloth = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;

        if (extraCount > 150){
            pricePerCloth = pricePerCloth * 0.90;
        }

        double finalSum = pricePerCloth * extraCount + decor;

        double difference = Math.abs(finalSum - budget);

        if (finalSum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
