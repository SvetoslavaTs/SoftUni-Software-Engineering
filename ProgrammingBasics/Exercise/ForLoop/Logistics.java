import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCargo = Integer.parseInt(scanner.nextLine());
        int bus = 0;
        int truck = 0;
        int train = 0;
        int price = 0;
        int totalTons = 0;


        for (int i = 1; i <= numberCargo; i++) {
            int cargoTons = Integer.parseInt(scanner.nextLine());
            if (cargoTons <= 3) {
                bus += cargoTons;
                totalTons += cargoTons;
                price += cargoTons * 200;
            } else if (cargoTons >= 4 && cargoTons <= 11) {
                truck += cargoTons;
                totalTons += cargoTons;
                price += cargoTons * 175;
            } else {
                train += cargoTons;
                totalTons += cargoTons;
                price += cargoTons * 120;
            }
        }
        System.out.printf("%.2f%n", 1.0 * price / totalTons);
        System.out.printf("%.2f%%%n", 1.0 * bus / totalTons * 100);
        System.out.printf("%.2f%%%n", 1.0 * truck / totalTons * 100);
        System.out.printf("%.2f%%%n", 1.0 * train / totalTons * 100);
    }
}
