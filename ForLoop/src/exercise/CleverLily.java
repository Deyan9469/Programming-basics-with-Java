package exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceForWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        int savedMoney = 0;
        int sumForMoney = 0;

        for (int currentAge = 1; currentAge <= age; currentAge++){

            if (currentAge % 2 == 0){
                savedMoney += 10;
                sumForMoney += savedMoney;
                sumForMoney--;
            }else {
                countToys++;
            }

        }

        int sumForToys = countToys * priceToy;

        int finalSum = sumForMoney + sumForToys;

        double diff = Math.abs(priceForWashingMachine - finalSum);

        if (finalSum >= priceForWashingMachine){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
