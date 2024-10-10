package exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int readPages1hour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int amountHours = bookPages / readPages1hour;
        int hoursInADay = amountHours / daysToRead;

        System.out.println(hoursInADay);
    }
}
