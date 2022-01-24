import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String typeTicket = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double transportBudget = 0;
        double ticketPrice = 0;
        double total = 0;

        if (people >= 1 && people <= 4) {
            transportBudget = budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            transportBudget = budget * 0.60;
        } else if (people >= 10 && people <= 24) {
            transportBudget = budget * 0.50;
        } else if (people >= 25 && people <= 49) {
            transportBudget = budget * 0.40;
        } else if (people >= 50) {
            transportBudget = budget * 0.25;
        }

        switch (typeTicket) {
            case "VIP":
                ticketPrice = people * 499.99;
                total = ticketPrice + transportBudget;
                if (total < budget) {
                    total = budget - total;
                    System.out.printf("Yes! You have %.2f leva left.", total);
                } else {
                    total -= budget;
                    System.out.printf("Not enough money! You need %.2f leva.", total);
                }
                break;
            case "Normal":
                ticketPrice = people * 249.99;
                total = ticketPrice + transportBudget;
                if (total < budget) {
                    total = budget - total;
                    System.out.printf("Yes! You have %.2f leva left.", total);
                } else {
                    total -= budget;
                    System.out.printf("Not enough money! You need %.2f leva.", total);
                }
                break;

        }
    }
}
