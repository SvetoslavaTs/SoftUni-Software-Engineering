import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        int nights = days - 1;
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = nights * 18;
                break;
            case "apartment":
                if (days < 10) {
                    price = (nights * 25) * 0.70;
                } else if (nights >= 10 && days <= 15) {
                    price = (nights * 25) * 0.65;
                } else if (nights > 15) {
                    price = (nights * 25) * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = (nights * 35) * 0.90;
                } else if (nights >= 10 && days <= 15) {
                    price = (nights * 35) * 0.85;
                } else if (nights > 15) {
                    price = (nights * 35) * 0.80;
                }
                break;
        }

        if (rating.equals("positive")) {
            price += (price * 0.25);
        } else if (rating.equals("negative")) {
            price -= (price * 0.10);
        }
        System.out.printf("%.2f", price);

    }
}
