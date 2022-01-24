import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTables = Integer.parseInt(scanner.nextLine());
        double lengthOfRectangularTable = Double.parseDouble(scanner.nextLine());
        double widthOfRectangularTable = Double.parseDouble(scanner.nextLine());

        double rectangularArea = (lengthOfRectangularTable + 2 * 0.30) * (widthOfRectangularTable + 2 * 0.30);
        double squareArea = (lengthOfRectangularTable / 2) * (lengthOfRectangularTable / 2);

        double pricePerOneRectTablecloth = rectangularArea * 7;
        double pricePerOneSqTablecloth = squareArea * 9;

        double pricePerNumberOfRectTablecloths = pricePerOneRectTablecloth * numberOfTables;
        double pricePerNumberOfSqTablecloths = pricePerOneSqTablecloth * numberOfTables;

        double totalPriceUsd = pricePerNumberOfRectTablecloths + pricePerNumberOfSqTablecloths;
        double totalPriceBgn = totalPriceUsd * 1.85;
        System.out.printf("%.2f USD %n", totalPriceUsd);
        System.out.printf("%.2f BGN", totalPriceBgn);

    }
}
