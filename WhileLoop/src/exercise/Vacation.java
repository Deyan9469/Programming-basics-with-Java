package exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int countSpend = 0;
        int countDays = 0;

        while (availableMoney < needMoney){

            if (countSpend == 5){
                break;
            }

            String command = scanner.nextLine();
            double currentSum = Double.parseDouble(scanner.nextLine());
            countDays++;

            if (command.equals("spend")){
                availableMoney -= currentSum;
                countSpend++;
            } else if (command.equals("save")) {
                availableMoney += currentSum;
                countSpend = 0;
            }

            if (availableMoney < 0){
                availableMoney = 0;
            }

        }

        if (countSpend == 5){
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDays);

        }else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
