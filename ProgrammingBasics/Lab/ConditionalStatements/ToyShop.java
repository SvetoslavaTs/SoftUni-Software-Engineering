import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int amountOfPuzzles = Integer.parseInt(scanner.nextLine());
        int amountOfDolls = Integer.parseInt(scanner.nextLine());
        int amountOfBears = Integer.parseInt(scanner.nextLine());
        int amountOfMinions = Integer.parseInt(scanner.nextLine());
        int amountOfTrucks = Integer.parseInt(scanner.nextLine());
        int totalAmount = amountOfPuzzles + amountOfDolls + amountOfBears + amountOfMinions + amountOfTrucks;


        if (totalAmount < 50) {
            totalPrice = (amountOfPuzzles * 2.60 + amountOfDolls * 3 + amountOfBears * 4.10 + amountOfMinions * 8.20 + amountOfTrucks * 2) * 0.9;
        } else {
            totalPrice = ((amountOfPuzzles * 2.60 + amountOfDolls * 3 + amountOfBears * 4.10 + amountOfMinions * 8.20 + amountOfTrucks * 2) * 0.75) * 0.9;
        }
        if (totalPrice < tripPrice) {
            double neededMoney = tripPrice - totalPrice;
            System.out.printf("Not enough money! " + "%.2f" + " lv needed.", neededMoney);
        } else {
            double enoughMoney = totalPrice - tripPrice;
            System.out.printf("Yes! " + "%.2f" + " lv left.", enoughMoney);
        }
    }
}

