package exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = 0;

        switch (flower){
            case "Roses":
                total = countFlowers * 5;
                if (countFlowers > 80){
                    total = total * 0.90;
                }
                break;

            case "Dahlias":
                total = countFlowers * 3.80;
                if (countFlowers > 90){
                    total = total * 0.85;
                }
                break;

            case "Tulips":
                total = countFlowers * 2.80;
                if (countFlowers > 80){
                    total = total * 0.85;
                }
                break;

            case "Narcissus":
                total = countFlowers * 3.00;
                if (countFlowers < 120){
                    total = total * 1.15;
                }
                break;

            case "Gladiolus":
                total = countFlowers * 2.50;
                if (countFlowers < 80){
                    total = total * 1.20;
                }
                break;
        }

        double diff = Math.abs(budget - total);

        if (budget >= total){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, diff);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
