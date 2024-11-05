package exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int toysCount = puzzlesCount + dollsCount + bearsCount + minionsCount + trucksCount;

        double totalPrice = puzzlesCount * 2.60 +
                dollsCount * 3.00 +
                bearsCount * 4.10 +
                minionsCount * 8.20 +
                trucksCount * 2.00;

        if (toysCount >= 50) {
            totalPrice = totalPrice * 0.75;
        }

        totalPrice = totalPrice * 0.90;

        double restMoney = Math.abs(totalPrice - tripPrice);

        if (totalPrice >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", restMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", restMoney);
        }
    }
}
