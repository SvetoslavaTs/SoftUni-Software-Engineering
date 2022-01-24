import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        switch (season) {
            case "May":
            case "October":
                if (numberOfNights > 7 && numberOfNights <= 14) {
                    priceStudio = (numberOfNights * 50) * 0.95;
                    priceApartment = numberOfNights * 65;
                } else if (numberOfNights > 14) {
                    priceStudio = (numberOfNights * 50) * 0.7;
                    priceApartment = (numberOfNights * 65) * 0.9;
                } else {
                    priceStudio = numberOfNights * 50;
                    priceApartment = numberOfNights * 65;
                }
                break;
            case "June":
            case "September":
                if (numberOfNights > 14) {
                    priceStudio = (numberOfNights * 75.20) * 0.8;
                    priceApartment = (numberOfNights * 68.70) * 0.9;
                } else {
                    priceStudio = numberOfNights * 75.20;
                    priceApartment = numberOfNights * 68.70;
                }
                break;
            case "July":
            case "August":
                if (numberOfNights > 14) {
                    priceStudio = numberOfNights * 76;
                    priceApartment = (numberOfNights * 77) * 0.9;
                } else {
                    priceStudio = numberOfNights * 76;
                    priceApartment = numberOfNights * 77;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", priceApartment, priceStudio);
    }
}
