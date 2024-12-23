package exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeInLiter = volume * 0.001;
        double neededLiters = volumeInLiter * (1 - (percent / 100));

        System.out.println(neededLiters);
    }
}
