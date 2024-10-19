package exerice;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double sumForVideoCard = videoCardCount * 250;

        double priceForProcessor = sumForVideoCard * 0.35;
        double sumForProcessor = priceForProcessor * processorCount;

        double priceForRam = sumForVideoCard * 0.10;
        double sumForRam = priceForRam * ramCount;

        double finalSum = sumForVideoCard + sumForProcessor + sumForRam;

        if (videoCardCount > processorCount) {
            finalSum = finalSum * 0.85;
        }

        double diff = Math.abs(finalSum - budget);

        if (budget >= finalSum) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
