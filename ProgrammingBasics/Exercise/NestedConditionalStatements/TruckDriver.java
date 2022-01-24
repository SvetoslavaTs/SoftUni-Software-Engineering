import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmMonthly = Double.parseDouble(scanner.nextLine());
        double salary = 0;

        if (kmMonthly <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salary = ((kmMonthly * 0.75) * 4) * 0.90;
                    break;
                case "Summer":
                    salary = ((kmMonthly * 0.90) * 4) * 0.90;
                    break;
                case "Winter":
                    salary = ((kmMonthly * 1.05) * 4) * 0.90;
                    break;
            }
        } else if (kmMonthly > 5000 && kmMonthly <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salary = ((kmMonthly * 0.95) * 4) * 0.90;
                    break;
                case "Summer":
                    salary = ((kmMonthly * 1.10) * 4) * 0.90;
                    break;
                case "Winter":
                    salary = ((kmMonthly * 1.25) * 4) * 0.90;
                    break;
            }
        } else {
            salary = ((kmMonthly * 1.45) * 4) * 0.90;
        }
        System.out.printf("%.2f", salary);
    }
}
