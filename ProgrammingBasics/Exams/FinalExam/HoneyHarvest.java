import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int numOfFlowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double honey = 0;

        switch (flower) {
            case "Sunflower":
                switch (season) {
                    case "Spring":
                        honey = 10 * numOfFlowers;
                        break;
                    case "Summer":
                        honey = 8 * numOfFlowers + (8 * numOfFlowers * 0.1);
                        break;
                    case "Autumn":
                        honey = 12 * numOfFlowers * 0.95;
                        break;
                }
                break;
            case "Daisy":
                switch (season) {
                    case "Spring":
                        honey = 12 * numOfFlowers + (12 * numOfFlowers * 0.1);
                        break;
                    case "Summer":
                        honey = 8 * numOfFlowers + (8 * numOfFlowers * 0.1);
                        break;
                    case "Autumn":
                        honey = 6 * numOfFlowers * 0.95;
                        break;
                }
                break;
            case "Lavender":
                switch (season) {
                    case "Spring":
                        honey = 12 * numOfFlowers;
                        break;
                    case "Summer":
                        honey = 8 * numOfFlowers + (8 * numOfFlowers * 0.1);
                        break;
                    case "Autumn":
                        honey = 6 * numOfFlowers * 0.95;
                        break;
                }
                break;
            case "Mint":
                switch (season) {
                    case "Spring":
                        honey = 10 * numOfFlowers + (10 * numOfFlowers * 0.1);
                        break;
                    case "Summer":
                        honey = 12 * numOfFlowers + (12 * numOfFlowers * 0.1);
                        break;
                    case "Autumn":
                        honey = 6 * numOfFlowers * 0.95;
                        break;
                }


        }
        System.out.printf("Total honey harvested: %.2f", honey);
    }
}
