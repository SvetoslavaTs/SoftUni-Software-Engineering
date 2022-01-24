import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();


        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double totalSavings = 0;
            while (totalSavings < budget) {
                double savings = Double.parseDouble(scanner.nextLine());
                totalSavings += savings;
                if (totalSavings >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                }
            }
            destination = scanner.nextLine();
        }
    }
}
