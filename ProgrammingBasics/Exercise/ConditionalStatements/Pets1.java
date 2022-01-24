import java.util.Scanner;

public class Pets1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double foodDogKg = Double.parseDouble(scanner.nextLine());
        double foodCatKg = Double.parseDouble(scanner.nextLine());
        double foodTurtleGrams = Double.parseDouble(scanner.nextLine());

        double food = (foodDogKg * days + foodCatKg * days + (foodTurtleGrams / 1000 * days));
        if (food <= foodLeftKg) {
            food = foodLeftKg - food;
            System.out.printf("%.0f kilos of food left.", Math.floor(food));
        } else {
            food = food - foodLeftKg;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(food));
        }

    }
}
