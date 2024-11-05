package lecture;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        String text = scanner.next();

        while (!text.equals("Stop")) {
            int number = Integer.parseInt(text);

            if (number > maxNumber) {
                maxNumber = number;
            }

            text = scanner.next();
        }

        System.out.println(maxNumber);
    }
}
