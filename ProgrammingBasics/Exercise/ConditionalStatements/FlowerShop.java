import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        double profit = (magnolias * 3.25 + hyacinths * 4 + roses * 3.50 + cacti * 8) * 0.95;
        if (profit >= present) {
            profit -= present;
            System.out.printf("She is left with %.0f leva.", Math.floor(profit));
        } else {
            profit = present - profit;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(profit));
        }

    }
}
