import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfMackerel = Double.parseDouble(scanner.nextLine());
        double priceOfSprat = Double.parseDouble(scanner.nextLine());
        double chamoisInKilos = Double.parseDouble(scanner.nextLine());
        double horseMackerelInKilos = Double.parseDouble(scanner.nextLine());
        double musselsInKilos = Double.parseDouble(scanner.nextLine());

        double priceOfChamois = priceOfMackerel + priceOfMackerel * 0.6;
        double priceOfHorseMackerel = priceOfSprat + priceOfSprat * 0.8;
        double priceOfMussels = 7.5;

        double totalPriceChamois = chamoisInKilos * priceOfChamois;
        double totalPriceHorseMackerel = horseMackerelInKilos * priceOfHorseMackerel;
        double totalPriceMussels = musselsInKilos * priceOfMussels;
        double totalPrice = totalPriceChamois + totalPriceHorseMackerel + totalPriceMussels;
        System.out.printf("%.2f", totalPrice);
    }
}
