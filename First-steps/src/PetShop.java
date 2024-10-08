import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double amountDogFood = dogFood * 2.50;
        double amountCatFood = catFood * 4;
        double result = amountDogFood + amountCatFood;

        System.out.println(result + " " + "lv.");
    }
}
