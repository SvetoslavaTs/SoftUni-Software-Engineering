import java.util.Scanner;

public class CruiseShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeCruise = scanner.nextLine();
        String typeCabin = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double costs = 0;

        if (typeCruise.equals("Mediterranean")) {
            switch (typeCabin) {
                case "standard cabin":
                    costs = nights * 27.50 * 4;
                    break;
                case "cabin with balcony":
                    costs = nights * 30.20 * 4;
                    break;
                case "apartment":
                    costs = nights * 40.50 * 4;
                    break;
            }
        } else if (typeCruise.equals("Adriatic")) {
            switch (typeCabin) {
                case "standard cabin":
                    costs = nights * 22.99 * 4;
                    break;
                case "cabin with balcony":
                    costs = nights * 25.00 * 4;
                    break;
                case "apartment":
                    costs = nights * 34.99 * 4;
                    break;
            }
        } else if (typeCruise.equals("Aegean")) {
            switch (typeCabin) {
                case "standard cabin":
                    costs = nights * 23.00 * 4;
                    break;
                case "cabin with balcony":
                    costs = nights * 26.60 * 4;
                    break;
                case "apartment":
                    costs = nights * 39.80 * 4;
                    break;
            }
        }
        if (nights > 7) {
            costs *= 0.75;
        }
        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", typeCruise, costs);
    }
}
