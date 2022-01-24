import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlower = scanner.nextLine();
        int amountFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalBudget = 0;


        switch (typeFlower) {
            case "Roses":
                if (amountFlowers > 80) {
                    totalBudget = (amountFlowers * 5) * 0.9;
                } else {
                    totalBudget = amountFlowers * 5;
                }
                break;
            case "Dahlias":
                if (amountFlowers > 90) {
                    totalBudget = (amountFlowers * 3.80) * 0.85;
                } else {
                    totalBudget = amountFlowers * 3.80;
                }
                break;
            case "Tulips":
                if (amountFlowers > 80) {
                    totalBudget = (amountFlowers * 2.80) * 0.85;
                } else {
                    totalBudget = amountFlowers * 2.80;
                }
                break;
            case "Narcissus":
                if (amountFlowers < 120) {
                    totalBudget = (amountFlowers * 3) + (amountFlowers * 3) * 0.15;
                } else {
                    totalBudget = amountFlowers * 3;
                }
                break;
            case "Gladiolus":
                if (amountFlowers < 80) {
                    totalBudget = (amountFlowers * 2.50) + (amountFlowers * 2.50) * 0.2;
                } else {
                    totalBudget = amountFlowers * 2.50;
                }
                break;
        }
        if (budget >= totalBudget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amountFlowers, typeFlower, (budget - totalBudget));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalBudget - budget);
        }


    }
}
