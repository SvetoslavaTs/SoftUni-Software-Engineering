import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char holidayOrNot = scanner.nextLine().charAt(0);
        double priceBouquet1 = chrysanthemums * 2 + roses * 4.10 + tulips * 2.50;
        double priceBouquet2 = chrysanthemums * 3.75 + roses * 4.50 + tulips * 4.15;
        int totalFlowers = chrysanthemums + roses + tulips;
        double total = 0;

        switch (holidayOrNot) {
            case 'Y':
                if (season.equals("Spring") || season.equals("Summer")) {
                    total = priceBouquet1 + (priceBouquet1 * 0.15);
                    if (tulips > 7 && season.equals("Spring")) {
                        total = total * 0.95;
                    }
                } else if (season.equals("Autumn") || season.equals("Winter")) {
                    total = priceBouquet2 + (priceBouquet2 * 0.15);
                    if (roses > 10 && season.equals("Winter")) {
                        total = total * 0.90;
                    }
                }
                break;
            case 'N':
                if (season.equals("Spring") || season.equals("Summer")) {
                    total = priceBouquet1;
                    if (tulips > 7 && season.equals("Spring")) {
                        total = total * 0.95;
                    }
                } else if (season.equals("Autumn") || season.equals("Winter")) {
                    total = priceBouquet2;
                    if (roses >= 10 && season.equals("Winter")) {
                        total = total * 0.90;
                    }
                }
                break;
        }
        if (totalFlowers > 20) {
            total = total * 0.8;
        }
        System.out.printf("%.2f", total + 2);


    }
}