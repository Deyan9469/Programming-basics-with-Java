package exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double deposit = Double.parseDouble(scanner.nextLine());
        int termOfDeposit = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        double sum = deposit + termOfDeposit * ((deposit * (annualInterestRate / 100) / 12));

        System.out.println(sum);
    }
}
