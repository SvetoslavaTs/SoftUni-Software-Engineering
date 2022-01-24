import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String tariff = scanner.nextLine();

        double taxi = 0;
        double bus = km * 0.09;
        double train = km * 0.06;

        if (tariff.equals("day") & km < 20) {
            taxi = 0.70 + (km * 0.79);
            System.out.printf("%.2f", taxi);
        } else if (tariff.equals("night") & km < 20) {
            taxi = 0.70 + (km * 0.90);
            System.out.printf("%.2f", taxi);
        } else if (km >= 20 & km < 100) {
            System.out.printf("%.2f", bus);
        } else if (km >= 100) {
            System.out.printf("%.2f", train);
        }

    }
}
