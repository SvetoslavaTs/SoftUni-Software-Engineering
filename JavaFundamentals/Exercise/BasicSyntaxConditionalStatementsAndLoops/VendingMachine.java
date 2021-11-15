package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;

        while (!(input.equals("Start"))) {
            double inputAsDouble = Double.parseDouble(input);
            if (inputAsDouble == 0.1 || inputAsDouble == 0.2 || inputAsDouble == 0.5 || inputAsDouble == 1 || inputAsDouble == 2) {
                sum += inputAsDouble;
            } else {
                System.out.printf("Cannot accept %.2f%n", inputAsDouble);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!(input.equals("End"))) {
            switch (input) {
                case "Nuts":
                    if (sum < 2) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 2.0;
                    System.out.println("Purchased " + input);
                    break;
                case "Water":
                    if (sum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 0.7;
                    System.out.println("Purchased " + input);
                    break;
                case "Crisps":
                    if (sum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 1.5;
                    System.out.println("Purchased " + input);
                    break;
                case "Soda":
                    if (sum < 0.8) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 0.8;
                    System.out.println("Purchased " + input);
                    break;
                case "Coke":
                    if (sum < 1.0) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sum -= 1.0;
                    System.out.println("Purchased " + input);
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            input = scanner.nextLine();
        }
        if (sum <= 0) {
            System.out.println("Change: 0.00");
        } else {
            System.out.printf("Change: %.2f", sum);
        }


    }


}
