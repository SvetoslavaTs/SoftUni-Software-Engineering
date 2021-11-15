package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;

        if ("Students".equals(typeOfGroup)) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 8.45 * number;
                    break;
                case "Saturday":
                    price = 9.80 * number;
                    break;
                case "Sunday":
                    price = 10.46 * number;
                    break;
            }
            if (number >= 30) {
                price = price * 0.85;
            }
        } else if (typeOfGroup.equals("Business")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 10.90 * number;
                    break;
                case "Saturday":
                    price = 15.60 * number;
                    break;
                case "Sunday":
                    price = 16 * number;
                    break;
            }
            if (number >= 100) {
                price -= (price / number) * 10;
            }
        } else if (typeOfGroup.equals("Regular")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 15 * number;
                    break;
                case "Saturday":
                    price = 20 * number;
                    break;
                case "Sunday":
                    price = 22.50 * number;
                    break;
            }
            if (number >= 10 && number <= 20) {
                price -= price * 0.05;
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
