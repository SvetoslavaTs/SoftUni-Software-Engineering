import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfDogs = Integer.parseInt(scanner.nextLine());
        int numbersOfOtherAnimals = Integer.parseInt(scanner.nextLine());
        double priceDogsFood = numbersOfDogs * 2.5;
        int priceOtherAnimalsFood = numbersOfOtherAnimals * 4;
        double totalPrice = priceDogsFood + priceOtherAnimalsFood;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
