package exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int separator = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double sumNylon = (nylon + 2) * 1.50;
        double sumPaint = (paint + paint * 0.1) * 14.50;
        double sumSeparator = separator * 5.00;

        double sumMaterials = sumNylon + sumPaint + sumSeparator + 0.40;
        double sumWorkers = (sumMaterials * 0.30) * workHours;
        double total = sumMaterials + sumWorkers;

        System.out.println(total);

    }
}
