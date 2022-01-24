import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSumExpected = Integer.parseInt(scanner.nextLine());
        String end = scanner.nextLine();
        int counter = 0;
        int collectedSumCash = 0;
        int numbersOfCahsPayments = 0;
        int collectedSumCard = 0;
        int numbersOfCardPayments = 0;

        while (!end.equals("End")) {
            int currentPayment = Integer.parseInt(end);
            counter++;
            if (counter == 1 && currentPayment <= 100) {
                collectedSumCash += currentPayment;
                numbersOfCahsPayments++;
                System.out.println("Product sold!");
            } else if (counter == 2 && currentPayment >= 10) {
                collectedSumCard += currentPayment;
                numbersOfCardPayments++;
                System.out.println("Product sold!");
            } else {
                System.out.println("Error in transaction!");
            }
            if (totalSumExpected <= (collectedSumCard + collectedSumCash)) {
                System.out.printf("Average CS: %.2f%n", 1.0 * collectedSumCash / numbersOfCahsPayments);
                System.out.printf("Average CC: %.2f", 1.0 * collectedSumCard / numbersOfCardPayments);
                break;
            }
            if (counter == 2) {
                counter = 0;
            }
            end = scanner.nextLine();
        }
        if (end.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
