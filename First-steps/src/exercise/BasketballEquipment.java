package exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earTax = Integer.parseInt(scanner.nextLine());

        double shoes = earTax * 0.60;
        double outfit = shoes * 0.80;
        double basketball = outfit / 4;
        double basketballAccessory = basketball / 5;

        double total = earTax + shoes + outfit + basketball + basketballAccessory;

        System.out.println(total);
    }
}
