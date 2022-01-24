import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // площ за вино = площ X *0.4;
        // литри вино от тази площ = Y * площ за вино;
        // произведено вино в литри = литри вино от тази площ / 2,5;
        // желано количество Z литра;
        // if произведено вино в литри < желано количество Z литри -> смятам Z - произведено вино
        // “It will be a tough winter! More {недостигащо вино } liters wine needed.” закръглен към по-ниско цяло число
        // else -> смятам произведено вино / брой работници; произведено - Z вино;
        // “Good harvest this year! Total wine: {общо вино} liters.” закръглен към по-ниско цяло число
        // “{Оставащо вино} liters left -> {вино за 1 работник} liters per person.”И двата резултата трябва да са закръглени към по-високото цяло число

        int area = Integer.parseInt(scanner.nextLine());
        double grape = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int numberWorkers = Integer.parseInt(scanner.nextLine());

        double wineArea = area * 0.4;
        double wine = wineArea * grape;
        double producedWine = wine / 2.5;
        if (producedWine < wineNeeded) {
            double shortage = Math.floor(wineNeeded - producedWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", shortage);
        } else {
            producedWine = Math.floor(producedWine);
            double restWine = Math.ceil(producedWine - wineNeeded);
            double winePerWorker = Math.ceil(restWine / numberWorkers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.", producedWine, restWine, winePerWorker);
        }

    }
}
