import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        int profitCakesPerDay = cakes * 45;
        double profitWafflesPerDay = waffles * 5.80;
        double profitPancakesPerDay = pancakes * 3.20;
        double profitPerOneCook = profitCakesPerDay + profitPancakesPerDay + profitWafflesPerDay;
        double profitPerAllCooks = profitPerOneCook * cooks;
        double totalProfit = profitPerAllCooks * days;
        double charitySum = totalProfit * 0.875;
        System.out.printf("%.2f", charitySum);
    }
}
