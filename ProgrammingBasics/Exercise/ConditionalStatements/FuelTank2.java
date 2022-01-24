import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelLitres = Double.parseDouble(scanner.nextLine());
        String cardDiscount = scanner.nextLine();
        double total = 0;

        if (fuelType.equals("Gas")) {
            total = fuelLitres * 0.93;
            if (cardDiscount.equals("Yes")) {
                total -= (fuelLitres * 0.08);
            }
        } else if (fuelType.equals("Gasoline")) {
            total = fuelLitres * 2.22;
            if (cardDiscount.equals("Yes")) {
                total -= (fuelLitres * 0.18);
            }
        } else if (fuelType.equals("Diesel")) {
            total = fuelLitres * 2.33;
            if (cardDiscount.equals("Yes")) {
                total -= (fuelLitres * 0.12);
            }
        }
        if (fuelLitres >= 20 && fuelLitres <= 25) {
            total *= 0.92;
        } else if (fuelLitres > 25) {
            total *= 0.90;
        }

        System.out.printf("%.2f lv.", total);
    }
}

