package exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double delay = (Math.floor(distance / 15)) * 12.50;

        double result = distance * timeForOneMeter + delay;



        if (recordInSeconds > result){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        } else {
            double diff = result - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
