import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double greenArea = Double.parseDouble(scanner.nextLine());

        double price = greenArea * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;

        System.out.printf("The final price is: %f lv.%n", finalPrice);
        System.out.printf("The discount is: %f lv.%n", discount);
    }
}
