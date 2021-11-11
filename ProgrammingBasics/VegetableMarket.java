import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        double vegetableKilos = Double.parseDouble(scanner.nextLine());
        double fruitsKilos = Double.parseDouble(scanner.nextLine());
        double profitVegetables = vegetablesPrice * vegetableKilos / 1.94;
        double profitFruits = fruitsPrice * fruitsKilos / 1.94;
        double totalProfit = profitFruits + profitVegetables;
        System.out.printf("%.2f", totalProfit);
    }

}
