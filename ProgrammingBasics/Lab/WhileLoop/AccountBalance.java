import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int payments = Integer.parseInt(scanner.nextLine());
        double currentPaymentCounter = 1;
        double total = 0;


        while (currentPaymentCounter <= payments) {
            double currentPayment = Double.parseDouble(scanner.nextLine());
            if (currentPayment > 0) {
                System.out.printf("Increase: %.2f%n", currentPayment);
                currentPaymentCounter++;
                total += currentPayment;
            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f", total);


    }
}
