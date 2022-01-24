import java.util.Scanner;

public class BakingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfParticipants = Integer.parseInt(scanner.nextLine());
        int totalCounter = 0;
        double priceCookies = 0;
        double priceCakes = 0;
        double priceWaffles = 0;
        double sum = 0;

        for (int i = 1; i <= numOfParticipants; i++) {
            String name = scanner.nextLine();
            String typeOfCookies = scanner.nextLine();
            int cookies = 0;
            int cakes = 0;
            int waffles = 0;

            while (!typeOfCookies.equals("Stop baking!")) {
                int countOfCookies = Integer.parseInt(scanner.nextLine());
                totalCounter += countOfCookies;
                if (typeOfCookies.equals("cookies")) {
                    cookies += countOfCookies;
                    priceCookies = countOfCookies * 1.5;
                    sum += priceCookies;
                } else if (typeOfCookies.equals("cakes")) {
                    cakes += countOfCookies;
                    priceCakes = countOfCookies * 7.80;
                    sum += priceCakes;
                } else if (typeOfCookies.equals("waffles")) {
                    waffles += countOfCookies;
                    priceWaffles = countOfCookies * 2.30;
                    sum += priceWaffles;
                }
                typeOfCookies = scanner.nextLine();
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", name, cookies, cakes, waffles);
        }
        System.out.printf("All bakery sold: %d%n", totalCounter);
        System.out.printf("Total sum for charity: %.2f lv.", sum);
    }
}
