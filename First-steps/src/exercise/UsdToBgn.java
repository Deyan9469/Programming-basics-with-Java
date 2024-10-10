package exercise;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = 1.79549;
        double result = usd * bgn;
        System.out.println(result);
    }
}
