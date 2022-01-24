import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double fuelInLitres = Double.parseDouble(scanner.nextLine());

        if (fuel.equals("Diesel")) {
            if (fuelInLitres >= 25) {
                System.out.printf("You have enough %s.", fuel);
            } else if (fuelInLitres < 25) {
                System.out.printf("Fill your tank with %s!", fuel);
            }
        } else if (fuel.equals("Gasoline")) {
            if (fuelInLitres >= 25) {
                System.out.printf("You have enough %s.", fuel);
            } else if (fuelInLitres < 25) {
                System.out.printf("Fill your tank with %s!", fuel);
            }
        } else if (fuel.equals("Gas")) {
            if (fuelInLitres >= 25) {
                System.out.printf("You have enough %s.", fuel);
            } else if (fuelInLitres < 25) {
                System.out.printf("Fill your tank with %s!", fuel);
            }
        } else {
            System.out.println("Invalid fuel!");
        }

    }
}
