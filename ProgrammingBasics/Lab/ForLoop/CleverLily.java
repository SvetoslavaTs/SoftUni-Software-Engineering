import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        double savings = 0;
        double currentBdayMoney = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savings += currentBdayMoney - 1;
                currentBdayMoney += 10;
            } else {
                savings += priceToy;
            }
        }

        if (priceWashingMachine <= savings) {
            System.out.printf("Yes! %.2f", savings - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - savings);
        }


    }
}
