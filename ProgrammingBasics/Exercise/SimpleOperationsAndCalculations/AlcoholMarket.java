import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceWhiskey = Double.parseDouble(scanner.nextLine());
        double litresBeer = Double.parseDouble(scanner.nextLine());
        double litresWine = Double.parseDouble(scanner.nextLine());
        double litresRakia = Double.parseDouble(scanner.nextLine());
        double litresWhiskey = Double.parseDouble(scanner.nextLine());

        double priceRakia = priceWhiskey * 0.5;
        double priceWine = priceRakia * 0.6;
        double priceBeer = priceRakia * 0.2;

        double total = priceWhiskey * litresWhiskey + priceRakia * litresRakia + priceWine * litresWine + priceBeer * litresBeer;
        System.out.printf("%.2f", total);
    }
}

