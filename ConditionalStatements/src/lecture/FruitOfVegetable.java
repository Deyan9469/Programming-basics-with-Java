package lecture;

import java.util.Scanner;

public class FruitOfVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> System.out.println("fruit");
            case "tomato", "cucumber", "pepper", "carrot" -> System.out.println("vegetable");
            default -> System.out.println("unknown");
        }
    }
}
