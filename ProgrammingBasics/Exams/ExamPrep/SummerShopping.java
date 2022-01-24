import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        double beachTowelPrice = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double umbrella = (beachTowelPrice / 3) * 2;
        double flipFlops = umbrella * 0.75;
        double bag = (flipFlops + beachTowelPrice) / 3;
        double spend = beachTowelPrice + umbrella + flipFlops + bag;
        double totalSpend = spend - (spend * discount / 100);

        if (totalSpend <= budget) {
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", totalSpend, budget - totalSpend);
        } else {
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", totalSpend, Math.abs(budget - totalSpend));
        }


    }
}
