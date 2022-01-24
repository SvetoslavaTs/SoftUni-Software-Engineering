import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFishermen = Integer.parseInt(scanner.nextLine());
        double total = 0;

        if ("Spring".equals(season)) {
            if (numberFishermen <= 6) {
                total = 3000 * 0.9;
            } else if (numberFishermen >= 7 && numberFishermen <= 11) {
                total = 3000 * 0.85;
            } else if (numberFishermen >= 12) {
                total = 3000 * 0.75;
            }
        } else if (("Summer".equals(season)) || ("Autumn".equals(season))) {
            if (numberFishermen <= 6) {
                total = 4200 * 0.9;
            } else if (numberFishermen >= 7 && numberFishermen <= 11) {
                total = 4200 * 0.85;
            } else if (numberFishermen >= 12) {
                total = 4200 * 0.75;
            }
        } else if ("Winter".equals(season)) {
            if (numberFishermen <= 6) {
                total = 2600 * 0.9;
            } else if (numberFishermen >= 7 && numberFishermen <= 11) {
                total = 2600 * 0.85;
            } else if (numberFishermen >= 12) {
                total = 2600 * 0.75;
            }
        }
        if ((numberFishermen % 2 == 0) && !(season.equals("Autumn"))) {
            total = total * 0.95;
        }
        if (budget >= total) {
            total = budget - total;
            System.out.printf("Yes! You have %.2f leva left.", total);
        } else {
            total -= budget;
            System.out.printf("Not enough money! You need %.2f leva.", total);
        }

    }
}
