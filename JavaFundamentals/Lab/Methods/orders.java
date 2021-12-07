package LabMethods;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        double quantity = scanner.nextDouble();
        calculateTotalPriceOfOrder(order, quantity);

    }

    static void calculateTotalPriceOfOrder(String order, double quantity) {
        double totalPrice = 0;
        switch (order) {
            case "coffee":
                totalPrice = 1.50 * quantity;
                break;
            case "water":
                totalPrice = 1.00 * quantity;
                break;
            case "coke":
                totalPrice = 1.40 * quantity;
                break;
            case "snacks":
                totalPrice = 2.00 * quantity;
                break;
        }

        System.out.printf("%.2f", totalPrice);
    }

}
