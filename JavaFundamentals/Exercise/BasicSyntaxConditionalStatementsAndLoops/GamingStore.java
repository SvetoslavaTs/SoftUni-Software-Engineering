package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import com.sun.nio.sctp.SendFailedNotification;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();
        double totalSpent = 0;

        while (!gameName.equals("Game Time")) {
            switch (gameName) {
                case "OutFall 4":
                    if (currentBalance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= 39.99;
                        totalSpent += 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    if (currentBalance < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= 15.99;
                        totalSpent += 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    if (currentBalance < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= 19.99;
                        totalSpent += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    if (currentBalance < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= 59.99;
                        totalSpent += 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    if (currentBalance < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= 29.99;
                        totalSpent += 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (currentBalance < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        currentBalance -= 39.99;
                        totalSpent += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }

            if (currentBalance == 0) {
                System.out.println("Out of money!");
                return;
            }
            gameName = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);

    }
}
