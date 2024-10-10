package exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double sumChicken = chickenMenu * 10.35;
        double sumFish = fishMenu * 12.40;
        double sumVegan = veganMenu * 8.15;
        double sum = sumChicken + sumFish + sumVegan;
        double desert = sum * 0.20;
        double total = sum + desert + 2.50;

        System.out.println(total);
    }
}
