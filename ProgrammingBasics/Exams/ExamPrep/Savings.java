import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = Double.parseDouble(scanner.nextLine());
        int monthsForSaving = Integer.parseInt(scanner.nextLine());
        double monthlyCosts = Double.parseDouble(scanner.nextLine());

        double costs = salary * 0.3 + monthlyCosts;
        double monthlySavings = salary - costs;
        double totalSavings = monthlySavings * monthsForSaving;
        System.out.printf("She can save %.2f%%%n", monthlySavings / salary * 100);
        System.out.printf("%.2f", totalSavings);
    }
}
